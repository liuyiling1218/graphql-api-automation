package com.hjfruit.test.pitaya.app.purchase;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.app.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RawMeterialPurchaseApplyHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RayMeterialPurchaseInOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
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
    RayMeterialPurchaseInOrderHelper rayMeterialPurchaseInOrderHelper;
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
        rayMeterialPurchaseInOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购(指定客户)-提交库管-全部入库")
    void testFlow_createWithDesignatedCustomer_submit_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER, "", PitayaConstants.CommodityType.RAW_MATERIAL);
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购(通用货品)-提交库管-全部入库")
    void testFlow_createWithNoCustomer_submit_allIn() {
        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.NO_CUSTOMER, "",PitayaConstants.CommodityType.RAW_MATERIAL);
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-完成入库")
    void testFlow_create_submit_partIn_completeIn() {
        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.NO_CUSTOMER, "",PitayaConstants.CommodityType.RAW_MATERIAL);
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.partIn(applyId);
        rayMeterialPurchaseInOrderHelper.complete(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-提交库管-部分入库-部分入库")
    void testFlow_create_submit_partIn_partIn() {
        String applyId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.partIn(applyId);
        rayMeterialPurchaseInOrderHelper.partIn(applyId);
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
        rayMeterialPurchaseInOrderHelper.reject(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
    }

    @Test
    @DisplayName("Flow:新增采购-修改订单-提交库管-全部入库")
    void testFlow_create_update_submit() {
        String applyId = rawMeterialPurchaseApplyHelper.Rawcreate();
        rawMeterialPurchaseApplyHelper.update(applyId);
        rawMeterialPurchaseApplyHelper.submit(applyId);
        rayMeterialPurchaseInOrderHelper.allIn(applyId);
    }

    @Test
    @DisplayName("Action:客户为通用货品时，创建采购订单")
    void testException_create_nocustoemr() {
//        customerHelper.switchCustomer(PitayaConstants.CustomerType.NO_CUSTOMER);

    }

    @Test
    @DisplayName("Action:客户为客户分组时，创建采购订单")
    void testException_create_custoemrgroup() {
        rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.CUSTOMER_GROUP, "",PitayaConstants.CommodityType.RAW_MATERIAL);
    }

    @Test
    @DisplayName("Action:客户为指定客户时，创建采购订单")
    void testException_update_designatedcustomer() {

     }

    @Test
    @DisplayName("Action:客户为指定客户时，创建采购订单")
    void testException_create_designatedcustomer() {
        System.out.println(RandomStringUtils.random(200));

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
