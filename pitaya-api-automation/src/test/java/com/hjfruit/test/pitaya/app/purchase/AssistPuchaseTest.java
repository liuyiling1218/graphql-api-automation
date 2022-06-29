package com.hjfruit.test.pitaya.app.purchase;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.helper.purchase.InOrderHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RawMeterialPurchaseApplyHelper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("辅料采购相关流程")
public class AssistPuchaseTest extends PitayaAppBaseTestV2 {
@Autowired
RawMeterialPurchaseApplyHelper rawMeterialPurchaseApplyHelper;
@Autowired
InOrderHelper inOrderHelper;

    @Test
    @DisplayName("Flow:新增采购-修改订单-提交库管-全部入库")
    void testFlow_create_submit_partIn_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.allIn(applyId);
    }
    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-完成入库")
    void testFlow_create_submit_partIn_completeIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.partIn(applyId);
        inOrderHelper.complete(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-部分入库")
    void testFlow_create_submit_partIn_partIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.partIn(applyId);
        inOrderHelper.partIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-取消入库")
    void testFlow_create_cancel() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.cancel(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-驳回-再次提交库管-全部入库")
    void testFlow_create_submit_turndown_resubmit() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.reject(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.allIn(applyId);
    }
}
