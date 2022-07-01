package com.hjfruit.test.pitaya.app.plan;

import com.hjfruit.test.pitaya.app.actions.plan.PlanAction;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesProductionPlan {
    @Autowired
    PlanAction planAction;
    @Autowired
    SaleOderAction saleOderAction;
    @Test
    @DisplayName("提交生产-分配生产任务")
    public void submit_distribute(){
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        planAction.doUpdatePlanInfo(saleOrder);

    }



}
