package com.hjfruit.test.pitaya.app.actions.plan;

import com.hjfruit.test.pitaya.app.apis.base.user.UserApi;
import com.hjfruit.test.pitaya.app.apis.plan.PlanApi;
import com.hjfruit.test.pitaya.app.apis.production.outorder.SaleOrderApi;
import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.base.user.ProductInput;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.RequestFlag;
import com.hjfruit.test.pitaya.app.entities.production.outorder.SaleOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.SaleOrderPayload;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import com.hjfruit.test.pitaya.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class PlanAction {
    @Autowired
    PlanApi planApi;
    @Autowired
    SaleOrderApi saleOrderApi;
    @Autowired
    UserApi userApi;

    /**
     * 根据生产组长名称获取组长ID
     */
    public Integer getLeaderIdByRoleName(String lineManagerName, String orderId) {
        ProductInput productInput = new ProductInput();
        productInput.setRoleName("生产组长");
        SaleOrderInput saleOrderInput = SaleOrderInput.builder().outOrderId(orderId).requestFlag(RequestFlag.AUDIT).build();
        SaleOrderPayload saleOrderPayload = saleOrderApi.saleOrder(saleOrderInput);
        productInput.setStorehouseId(saleOrderPayload.getWarehouseId());
        List<Option> options = userApi.listProductLeader(productInput);
        if (options.size() != 0) {
            for (Option option : options) {
                if (lineManagerName.equals(option.getLabel())) {
                    return option.getValue();
                }
            }
        } else {
            throw new RuntimeException("生产组长列表无数据");
        }
        throw new RuntimeException("未找到" + lineManagerName + "组长");
    }

    /**
     * 分配生产任务
     * @param orderId
     * @return
     */
    public String doUpdatePlanInfo(String orderId) {
        SaleOrderInput saleOrderInput = SaleOrderInput.builder().outOrderId(orderId).requestFlag(RequestFlag.AUDIT).build();
        SaleOrderPayload saleOrderPayload = saleOrderApi.saleOrder(saleOrderInput);
        UpdateProductionPlanInput updateProductionPlanInput = new UpdateProductionPlanInput();
        updateProductionPlanInput.setPlanId(saleOrderPayload.getPlan().getPlanId());
        updateProductionPlanInput.setPlanStartTime(saleOrderPayload.getPlan().getPlanStartTime());
        updateProductionPlanInput.setPlanEndTime(saleOrderPayload.getPlan().getPlanEndTime());
        updateProductionPlanInput.setPlanDescription("開始分配生產計劃咯~！");
        List<UpdatePlanTaskInput> updatePlanTask = new ArrayList<>();
        Integer LeaderId = getLeaderIdByRoleName("刘二", orderId);
        UpdatePlanTaskInput updatePlanTaskInput = new UpdatePlanTaskInput();
        updatePlanTaskInput.setLeaderId(LeaderId);
        updatePlanTaskInput.setLine(1);
        updatePlanTaskInput.setAssignmentType(PitayaConstants.AssignmentType.ASSIGNMENT.getAssignmentTypeId());
        updatePlanTaskInput.setUpdateTaskItemInput(saleOrderPayload.getCommodityList().stream().map(o -> {
            UpdateTaskItemInput updateTaskItemInput = new UpdateTaskItemInput();
            updateTaskItemInput.setCommoditySkuId(o.getCommoditySkuId());
            updateTaskItemInput.setExpectNum(new BigDecimal(o.getPlanQuantity()));
            return updateTaskItemInput;
        }).collect(Collectors.toList()));
        updatePlanTask.add(updatePlanTaskInput);
        updateProductionPlanInput.setUpdatePlanTaskInput(updatePlanTask);
        String s = planApi.doUpdatePlanInfo(updateProductionPlanInput);
        //断言生产计划详情页数据
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(s);
        assertThat(productionPlanDetail).isNotNull();
        return s;
    }
    /**
     * 新增生产计划任务
     */
    public String doInsertPlanTask(String planId) {
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        TaskInput taskInput = new TaskInput();
        taskInput.setPlanId(planId);
        taskInput.setLeaderId(productionPlanDetail.getTask().get(0).getLeaderId());
        taskInput.setLeaderName(productionPlanDetail.getTask().get(0).getLeaderName());
        taskInput.setLine(1);
        List<CommodityInput> commodityInputs = new ArrayList<>();
        CommodityInput commodityInput = CommodityInput.builder().commoditySkuId(productionPlanDetail.getTask().get(0).getCommodities().get(0).getCommoditySkuId())
                .expectNum(new BigDecimal(9))
                .build();
        commodityInputs.add(commodityInput);
        taskInput.setCommodities(commodityInputs);

        String s = planApi.doInsertPlanTask(taskInput);
        assertThat(s).isNotNull();
        return s ;
    }
    /**
     * 发布生产计划
     */
    public String doPublishPlan(String planId) {
        String s = planApi.doPublishPlan(planId);
        assertThat(s).isNotNull();
        return s;
    }
    /**
     * 删除生产任务
     */
    public String doDeletePlanTask(String planId){
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        String s = planApi.doDeletePlanTask(productionPlanDetail.getTask().get(0).getTaskId());
        assertThat(s).isNotNull();
        return s;
    }
    /**
     * 删除同一任务下商品
     */
    public String doUpdatePlanTaskInfo(String planId){
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        productionPlanDetail.getTask().get(0).getCommodities().get(0).getTaskItemId();
        PlanTaskInfoInput planTaskInfoInput=new PlanTaskInfoInput();
        planTaskInfoInput.setTaskId(productionPlanDetail.getTask().get(0).getTaskId());
        planTaskInfoInput.setPlanId(planId);
        planTaskInfoInput.setLeaderId(productionPlanDetail.getTask().get(0).getLeaderId());
        planTaskInfoInput.setLeaderName(productionPlanDetail.getTask().get(0).getLeaderName());
        planTaskInfoInput.setLine(1);
        List<CommodityInput> commodities=new ArrayList<>();
        CommodityInput commodityInput=new CommodityInput();
        commodityInput.setCommoditySkuId(productionPlanDetail.getTask().get(0).getCommodities().get(0).getCommoditySkuId());
        commodityInput.setExpectNum(new BigDecimal("18"));
        commodities.add(commodityInput);
        planTaskInfoInput.setCommodities(commodities);
        return planApi.doUpdatePlanTaskInfo(planTaskInfoInput);
    }
    /**
     * 修改生产计划基础信息
     */
     public String  doUpdatePlanBaseInfo(String planId){
         PlanBaseInfoInput planBaseInfoInput=PlanBaseInfoInput.builder().planId(planId).planDescription("修改基础信息").planStartTime(TimeUtil.getDailyStartTimeStamp()).planEndTime(TimeUtil.getDailyEndTimeStamp()).build();
         return planApi.doUpdatePlanBaseInfo(planBaseInfoInput);
     }


}