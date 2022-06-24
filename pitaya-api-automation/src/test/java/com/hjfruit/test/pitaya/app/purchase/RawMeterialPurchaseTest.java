package com.hjfruit.test.pitaya.app.purchase;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.app.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.InOrderHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RawMeterialPurchaseApplyHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


@DisplayName("原料采购")
public class RawMeterialPurchaseTest extends PitayaAppBaseTestV2 {
    @Autowired
    AcquireOrderAction acquireOrderAction;
    @Autowired
    InOrderAuditAction inOrderAuditAction;
    @Autowired
    RawMeterialPurchaseApplyHelper rawMeterialPurchaseApplyHelper;
    @Autowired
    InOrderHelper inOrderHelper;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    CommodityHelper commodityHelper;
    @Test
    @DisplayName("Flow:新增采购(客户分组)-提交库管-全部入库")
    void testFlow_createWithCustomerGroup_submit_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购(指定客户)-提交库管-全部入库")
    void testFlow_createWithDesignatedCustomer_submit_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER, "", PitayaConstants.CommodityType.RAW_MATERIAL);
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购(通用货品)-提交库管-全部入库")
    void testFlow_createWithNoCustomer_submit_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.NO_CUSTOMER, "",PitayaConstants.CommodityType.RAW_MATERIAL);
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-完成入库")
    void testFlow_create_submit_partIn_completeIn() {
        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.NO_CUSTOMER, "",PitayaConstants.CommodityType.RAW_MATERIAL);
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.partIn(applyId);
        inOrderHelper.complete(applyId);
    }
    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-部分入库")
    void testFlow_create_submit_partIn_partIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.partIn(applyId);
        inOrderHelper.partIn(applyId);
    }
    @Test
    @DisplayName("Flow:新增采购-取消入库")
    void testFlow_create_cancel() {
        String orderId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.cancel(orderId);
    }
    @Test
    @DisplayName("Flow:新增采购-提交库管-驳回-再次提交库管")
    void testFlow_create_submit_turndown_resubmit() {
        String applyId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.reject(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
    }
    @Test
    @DisplayName("Flow:新增采购-修改订单-提交库管-全部入库")
    void testFlow_create_update_submit() {
        String applyId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        inOrderHelper.allIn(applyId);
    }

    }


