package com.hjfruit.test.pitaya.app.task;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.plan.PlanAction;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherOutOrderAction;
import com.hjfruit.test.pitaya.app.actions.task.TaskAciton;
import com.hjfruit.test.pitaya.app.helper.transfer.TransferOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
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
    @Autowired
    OtherOutOrderAction otherOutOrderAction;
    @Autowired
    TransferOrderHelper transferOrderHelper;
    @DisplayName("提交生产-分配生产任务-发布生产计划-开始任务")
    @Test
    public void beginTask(){
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doPublishPlan(planId);
        taskAciton.beginTask(planId);
        //原料领料
        String s = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.RAW_MATERIAL);
        otherOutOrderAction.submitOutOrder(s);
        transferOrderHelper.confirmOutOrder(s);
        //辅料领料
        String s1 = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.ASSIST);
        otherOutOrderAction.submitOutOrder(s1);
        transferOrderHelper.confirmOutOrder(s1);
        //半成品领料
        String s2 = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.HALF_PRODUCT);
        otherOutOrderAction.submitOutOrder(s2);
        transferOrderHelper.confirmOutOrder(s2);
        //退货品领料
        String s3 = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.REBACK);
        otherOutOrderAction.submitOutOrder(s3);
        transferOrderHelper.confirmOutOrder(s3);

    }
    @DisplayName("提交生产-分配生产任务-发布生产计划-开始任务-暂停任务")
    @Test
    public void pauseTask(){
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doPublishPlan(planId);
        taskAciton.beginTask(planId);
        taskAciton.pauseOrContinueTask(planId);
    }





}
