package com.hjfruit.test.pitaya.app.purchase;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.app.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.app.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.helper.purchase.RawMeterialPurchaseOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("原料采购")
public class RawMeterialPurchaseTest extends PitayaAppBaseTest {
    @Autowired
    AcquireOrderAction acquireOrderAction;
    @Autowired
    InOrderAuditAction inOrderAuditAction;
    @Autowired
    RawMeterialPurchaseOrderHelper rawMeterialPurchaseOrderHelper;

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-全部入库")
    void testFlow_create_submit_partIn_allIn() {
        rawMeterialPurchaseOrderHelper.create(PitayaConstants.SupplierType.FOOD, PitayaConstants.CustomerType.NO_CUSTOMER, RandomStringUtils.random(200));

    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-完成入库")
    void testFlow_create_submit_partIn_completeIn() {

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
