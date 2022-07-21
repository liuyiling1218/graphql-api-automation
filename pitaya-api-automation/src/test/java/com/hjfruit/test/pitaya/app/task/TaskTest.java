package com.hjfruit.test.pitaya.app.task;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.plan.PlanAction;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherOutOrderAction;
import com.hjfruit.test.pitaya.app.actions.task.TaskAciton;
import com.hjfruit.test.pitaya.app.helper.purchase.InOrderHelper;
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
    @Autowired
    InOrderHelper inOrderHelper;
    @DisplayName("提交生产-分配生产任务-发布生产计划-开始任务-领料-入库-退料-报损")
    @Test
    public void beginTask(){
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        String planId = planAction.doUpdatePlanInfo(saleOrder);
        planAction.doPublishPlan(planId);
        taskAciton.beginTask(planId);
        //原料领料-修改-驳回-提交-全部出库
        String s = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.RAW_MATERIAL);
        otherOutOrderAction.submitOutOrder(s);
        transferOrderHelper.reject(s);
        otherOutOrderAction.submitOutOrder(s);
        transferOrderHelper.confirmOutOrder(s);
        //辅料领料-修改-驳回-提交-全部出库
        String s1 = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.ASSIST);
        otherOutOrderAction.submitOutOrder(s1);
        transferOrderHelper.reject(s1);
        otherOutOrderAction.submitOutOrder(s1);
        transferOrderHelper.confirmOutOrder(s1);
        //半成品领料-修改-驳回-提交-全部出库
        String s2 = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.HALF_PRODUCT);
        otherOutOrderAction.submitOutOrder(s2);
        transferOrderHelper.reject(s2);
        otherOutOrderAction.submitOutOrder(s2);
        transferOrderHelper.confirmOutOrder(s2);
        //退货品领料-修改-驳回-提交-全部出库
        String s3 = taskAciton.addOutOrder(planId, PitayaConstants.CommodityType.REBACK);
        otherOutOrderAction.submitOutOrder(s3);
        transferOrderHelper.reject(s3);
        otherOutOrderAction.submitOutOrder(s3);
        transferOrderHelper.confirmOutOrder(s3);
        //成品入库
        String s4 = taskAciton.addInOrder(planId, PitayaConstants.CommodityType.PRODUCT);
        taskAciton.submitInOrder(s4);
        inOrderHelper.otherInOrder(s4);
        //半成品入库
        String s5 = taskAciton.addInOrder(planId, PitayaConstants.CommodityType.HALF_PRODUCT);
        taskAciton.submitInOrder(s5);
        inOrderHelper.otherInOrder(s5);
        //次品入库
        String s6 = taskAciton.addInOrder(planId, PitayaConstants.CommodityType.DEFECTIVE);
        taskAciton.submitInOrder(s6);
        inOrderHelper.otherInOrder(s6);
        // TODO: 2022/7/21
       //完成任务
        taskAciton.completeTask(planId);
       //完成计划
        planAction.completePlan(planId);
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
