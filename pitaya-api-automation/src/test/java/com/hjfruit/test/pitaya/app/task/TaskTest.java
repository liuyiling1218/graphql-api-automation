package com.hjfruit.test.pitaya.app.task;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.plan.PlanAction;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import com.hjfruit.test.pitaya.app.actions.task.TaskAciton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("生产任务流程")
public class TaskTest extends PitayaAppBaseTestV2 {
    @Autowired
    PlanAction planAction;
    @Autowired
    SaleOderAction saleOderAction;
    @Autowired
    TaskAciton taskAciton;
    @DisplayName("提交生产-分配生产任务-发布生产计划-开始任务")
    @Test
    public void beginTask(){
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doPublishPlan(planId);
        taskAciton.beginTask(planId);
    }



}
