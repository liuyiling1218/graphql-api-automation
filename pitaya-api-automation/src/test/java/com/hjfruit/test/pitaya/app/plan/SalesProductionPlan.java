package com.hjfruit.test.pitaya.app.plan;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.plan.PlanAction;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
@DisplayName("生产计划流程")
public class SalesProductionPlan extends PitayaAppBaseTestV2 {
    @Autowired
    PlanAction planAction;
    @Autowired
    SaleOderAction saleOderAction;

    @Test
    @DisplayName("提交生产-分配生产任务-发布生产计划")
    public void submit_distribute_release() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doPublishPlan(planId);
    }
    @Test
    @DisplayName("提交生产-分配生产任务-新增生产任务-发布生产计划")
    public void submit_distribute_add_release() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doInsertPlanTask(planId);
        planAction.doPublishPlan(planId);
    }
    @Test
    @DisplayName("提交生产-分配生产任务-删除任务-发布生产计划")
    public void submit_distribute_delete_release() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doInsertPlanTask(planId);
        planAction.doDeletePlanTask(planId);
        planAction.doPublishPlan(planId);
    }
    @Test
    @DisplayName("提交生产-分配生产任务-删除任务-发布生产计划")
    public void submit_distribute_delete_production_release() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doUpdatePlanTaskInfo(planId);
        planAction.doPublishPlan(planId);
    }
    @Test
    @DisplayName("提交生产-分配生产任务-修改生产计划基础信息-发布生产计划")
    public void submit_distribute_updatePlan_release(){
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doUpdatePlanBaseInfo(planId);
        planAction.doPublishPlan(planId);
    }

}