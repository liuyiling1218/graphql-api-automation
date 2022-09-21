package com.hjfruit.test.pitaya.app.actions.task;

import com.hjfruit.test.pitaya.app.apis.commodity.PlanTaskCommodityQueryApi;
import com.hjfruit.test.pitaya.app.apis.plan.PlanApi;
import com.hjfruit.test.pitaya.app.apis.plan.PlanTaskApi;
import com.hjfruit.test.pitaya.app.apis.production.inorder.ProductionInOrderApi;
import com.hjfruit.test.pitaya.app.apis.production.outorder.ProductionOutOrderApi;
import com.hjfruit.test.pitaya.app.apis.production.task.ProductionTaskApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.plan.PauseOrContinueTaskInput;
import com.hjfruit.test.pitaya.app.entities.plan.ProductionPlanDetailPayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderUpdateInput;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import com.hjfruit.test.pitaya.utils.TimeUtil;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class TaskAciton {
    @Autowired
    ProductionTaskApi productionTaskApi;
    @Autowired
    PlanTaskApi planTaskApi;
    @Autowired
    PlanApi planApi;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    PlanTaskCommodityQueryApi planTaskCommodityQueryApi;
    @Autowired
    ProductionOutOrderApi productionOutOrderApi;
    @Autowired
    ProductionInOrderApi productionInOrderApi;

    /**
     * 开始任务
     * @param planId
     * @return
     */
  public Boolean beginTask(String planId){
      ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
      String taskId = productionPlanDetail.getTask().get(0).getTaskId();
      BeginTask beginTask= BeginTask.builder().taskId(taskId).numberActual(10).tempWorkerQuantity(20).build();
      //详情页断言
      Boolean aBoolean = productionTaskApi.beginTask(beginTask);
      assertThat(productionTaskApi.task(taskId).getTaskStatus()).isEqualTo(PitayaConstants.TaskStatus.IN_PRODUCTION.getCode());
      //单据数量断言
      assertThat(productionTaskApi.getFabricationStatistics(taskId).getPickingRecord()).isEqualTo(0);
      //状态栏数量统计
      assertThat(productionTaskApi.taskStatistics(TimeUtil.getCurrentTimeStamp()).getInProduction()).isNotEqualTo(0);
      //列表断言
      TaskCondition taskCondition=TaskCondition.builder().taskStatus(PitayaConstants.TaskStatus.IN_PRODUCTION.getCode()).date(TimeUtil.getCurrentTimeStamp()).build();
      assertThat(productionTaskApi.tasks(taskCondition,new Page(1,10)).getRecords().stream().anyMatch(o->o.getTaskId().equals(taskId))).isTrue();
      //查询功能
//      assertThat(productionTaskApi.keywordTasks("s",new Page(1,10)).getRecords()).isNotNull();
      return aBoolean;

  }
    /**
     * 暂停任务
     */
    public Boolean pauseOrContinueTask(String planId){
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        String taskId = productionPlanDetail.getTask().get(0).getTaskId();
        PauseOrContinueTaskInput pauseOrContinueTaskInput=PauseOrContinueTaskInput.builder().taskId(taskId).taskStatusCode(PitayaConstants.TaskStatus.TERMINATION.getCode()).build();
        return planTaskApi.pauseOrContinueTask(pauseOrContinueTaskInput);
    }
    /**
     *新增-修改领料订单
     */
    public String addOutOrder(String planId,PitayaConstants.CommodityType commodityType){
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        String taskId = productionPlanDetail.getTask().get(0).getTaskId();
        OutOrder outOrder=new OutOrder();
        outOrder.setTaskId(taskId);
        outOrder.setCommodityTypeId(commodityType.getTypeId());
        if (commodityType.getTypeName().contains("原料")) {
            outOrder.setOutOrderType(PitayaConstants.OutOrderType.RAW_MATERIAL_ACQUISITION.getTypeCode());
        } else if (commodityType.getTypeName().contains("辅料")) {
            outOrder.setOutOrderType(PitayaConstants.OutOrderType.SUPPLEMENTARY_MATERIAL_ACQUISITION.getTypeCode());
        } else if (commodityType.getTypeName().contains("半成品")) {
            outOrder.setOutOrderType(PitayaConstants.OutOrderType.SEMI_FINISHED_PRODUCT_ACQUISITION.getTypeCode());
        } else if (commodityType.getTypeName().contains("退货品")) {
            outOrder.setOutOrderType(PitayaConstants.OutOrderType.RETURNED_GOODS_OUT.getTypeCode());
        }
        outOrder.setOutOrderDescription("测试领料申请单备注~！");
        PageMoreCommoditiesInput pageMoreCommoditiesInput=new PageMoreCommoditiesInput();
        pageMoreCommoditiesInput.setCustomerId(productionPlanDetail.getCustomerId());
        pageMoreCommoditiesInput.setCustomerType(productionPlanDetail.getCustomerType());
        pageMoreCommoditiesInput.setWarehouseId(productionPlanDetail.getWarehouseId());
        pageMoreCommoditiesInput.setCommodityTypeId(commodityType.getTypeId());
        MoreCommoditiesPageResult moreCommoditiesPageResult = planTaskCommodityQueryApi.pageMoreCommodities(pageMoreCommoditiesInput, new Page(1, 10));
        List<TaskAcquireMaterialCommodityPayload> taskAcquireMaterialCommodityPayloads = moreCommoditiesPageResult.getRecords().subList(0, 2);
        outOrder.setOutOrderItem(taskAcquireMaterialCommodityPayloads.stream().map(o->{
            OutOrderItem outOrderItem=new OutOrderItem();
            outOrderItem.setCommoditySkuId(o.getCommoditySkuId());
            outOrderItem.setUnitQuantity(new BigDecimal(8.8));
            outOrderItem.setTotalQuantity(new BigDecimal(8.8));
            return outOrderItem;
        }).collect(Collectors.toList()));
        String s = productionTaskApi.addOutOrder(outOrder);
        outOrderMapper mapper = Mappers.getMapper(outOrderMapper.class);
        OutOrderUpdateInput outOrderUpdateInput = mapper.add_modify(outOrder);
        outOrderUpdateInput.setOutOrderId(s);
        productionOutOrderApi.modifyOutOrder(outOrderUpdateInput);
        return s;
    }

    /**
     * 创建生产入库申请单
     */
       public String addInOrder(String planId,PitayaConstants.CommodityType commodityType){
           ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
           String taskId = productionPlanDetail.getTask().get(0).getTaskId();
           ListTaskInCommodityInput listTaskInCommodityInput=new ListTaskInCommodityInput();
           InOrder inOrder=new InOrder();
           inOrder.setTaskId(taskId);
           inOrder.setCommodityTypeId(commodityType.getTypeId());
           if (commodityType.getTypeName().contains("成品")){
               inOrder.setInOrderType(PitayaConstants.InOrderType.PRODUCTION_IN_APPLY.getTypeCode());
               listTaskInCommodityInput.setInOrderType(PitayaConstants.InOrderType.PRODUCTION_IN_APPLY.getTypeCode());
           }else if (commodityType.getTypeName().contains("半成品")){
               inOrder.setInOrderType(PitayaConstants.InOrderType.SEMI_FINISHED_IN_APPLY.getTypeCode());
               listTaskInCommodityInput.setInOrderType(PitayaConstants.InOrderType.SEMI_FINISHED_IN_APPLY.getTypeCode());
           }else if (commodityType.getTypeName().contains("次品")){
               inOrder.setInOrderType(PitayaConstants.InOrderType.DEFECTIVE_IN_APPLY.getTypeCode());
               listTaskInCommodityInput.setInOrderType(PitayaConstants.InOrderType.DEFECTIVE_IN_APPLY.getTypeCode());
           }
           inOrder.setInOrderDescription("测试生产入库~~！~！~！~");
           listTaskInCommodityInput.setTaskId(taskId);
           listTaskInCommodityInput.setCommodityType(commodityType.getTypeId());
           List<CommoditySkuPayload> commoditySkuPayloads = planTaskCommodityQueryApi.taskInCommodities(listTaskInCommodityInput);
           inOrder.setInOrderItem(commoditySkuPayloads.stream().map(o->{
               InOrderItem inOrderItem=new InOrderItem();
               inOrderItem.setCommoditySkuId(o.getCommoditySkuId());
               inOrderItem.setUnitQuantity(new BigDecimal(8.8));
               if(commodityType.getTypeName().contains("次品")){
                   inOrderItem.setTotalQuantity(new BigDecimal(0));
               }else{
                   inOrderItem.setTotalQuantity(new BigDecimal(8.8));
               }
                return inOrderItem;
           }).collect(Collectors.toList()));
              return productionTaskApi.addInOrder(inOrder);
       }
    /**
     * 生产入库提交库管
     */
      public String submitInOrder(String orderId){
          return productionInOrderApi.submitInOrder(orderId);

      }
    /**
     * 完成任务
     */
    public Boolean completeTask(String planId){
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        String taskId = productionPlanDetail.getTask().get(0).getTaskId();
        return productionTaskApi.completeTask(taskId);
    }
    //创建领料单实体与修改建立映射关系
    @Mapper
    public interface outOrderMapper{

      OutOrderUpdateInput add_modify(OutOrder outOrder);

  }



}
