package com.hjfruit.test.pitaya.app.purchase;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.helper.purchase.RawMeterialPurchaseApplyHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RayMeterialPurchaseInOrderHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("辅料采购")
public class AssistPuchaseTest extends PitayaAppBaseTestV2 {
@Autowired
RawMeterialPurchaseApplyHelper rawMeterialPurchaseApplyHelper;
@Autowired
RayMeterialPurchaseInOrderHelper rayMeterialPurchaseInOrderHelper;
    @Test
    @DisplayName("Flow:新增采购-提交库管-全部入库")
    void testFlow_create_submit_partIn_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.allIn(applyId);

    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-完成入库")
    void testFlow_create_submit_partIn_completeIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Accessoriescreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.partIn(applyId);
        rayMeterialPurchaseInOrderHelper.complete(applyId);

    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-部分入库")
    void testFlow_create_submit_partIn_partIn() {

    }

    @Test
    @DisplayName("Flow:新增采购-取消入库")
    void testFlow_create_cancel() {

    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-驳回-再次提交库管")
    void testFlow_create_submit_turndown_resubmit() {

    }

    @Test
    @DisplayName("Flow:新增采购-修改订单-提交库管-全部入库")
    void testFlow_create_update_submit() {

    }

    @Test
    @DisplayName("Exception:新增采购时，备注超过200字，新增失败")
    void testException_create_remark() {

    }

    @Test
    @DisplayName("Exception:修改采购订单时，备注超过200字，新增失败")
    void testException_update_remark() {

    }

}
