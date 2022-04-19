package com.hjfruit.test.pitaya.app.transfer;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.production.outorder.TransferOutOrderAction;
import com.hjfruit.test.pitaya.app.actions.user.LoginAction;
import com.hjfruit.test.pitaya.app.helper.purchase.RawMeterialPurchaseApplyHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RayMeterialPurchaseInOrderHelper;
import com.hjfruit.test.pitaya.app.helper.transfer.TransferOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@DisplayName("调拨订单相关流程")
public class TransferOrderFlowTest extends PitayaAppBaseTestV2 {
    @Autowired
    TransferOutOrderAction transferOutOrderAction;
    @Autowired
    TransferOrderHelper transferOrderHelper;
    @Autowired
    RawMeterialPurchaseApplyHelper rawMeterialPurchaseApplyHelper;
    @Autowired
    RayMeterialPurchaseInOrderHelper rayMeterialPurchaseInOrderHelper;
    @Autowired
    LoginAction loginAction;


    @BeforeEach
    public void beforeEach() throws IOException, InterruptedException {
        super.beforeEach();
        //采购
//        String applyId = rawMeterialPurchaseApplyHelper.create(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER, "");
//        rawMeterialPurchaseApplyHelper.submit(applyId);
//        rayMeterialPurchaseInOrderHelper.allIn(applyId);
//        rayMeterialPurchaseInOrderHelper.getBillId(applyId);
    }

    @Test
    @DisplayName("[Flow]新增调拨（原料、跨组织）—提交库管-调拨出库-其他组织调拨入库")
    void testFlow_create_submit_outAudit_otherOrgInAudit() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        System.out.println("orderId:" + orderId);
        transferOrderHelper.submit(orderId);
        transferOrderHelper.confirmOutOrder(orderId);
        super.switchUser("18580870001");
//        loginAction.switchUserAndOrg("18580870001", "666666", 347);
        transferOrderHelper.confirmInOrder(orderId);
        loginAction.logout();
    }

    @Test
    @DisplayName("[Flow]新增调拨（辅料、跨组织）—提交库管-调拨出库-其他组织调拨入库")
    void testFlow_createWithAssist_submit_outAudit_otherOrgInAudit() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.ASSIST, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        System.out.println("orderId:" + orderId);
        transferOrderHelper.submit(orderId);
        transferOrderHelper.confirmOutOrder(orderId);
        loginAction.switchUserAndOrg("18580870001", "666666", 347);
        transferOrderHelper.confirmInOrder(orderId);
        loginAction.logout();
    }

    @Test
    @DisplayName("[Flow]新增调拨（成品、跨组织）—提交库管-调拨出库-其他组织调拨入库")
    void testFlow_createWithProduct_submit_outAudit_otherOrgInAudit() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.PRODUCT, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        System.out.println("orderId:" + orderId);
        transferOrderHelper.submit(orderId);
        transferOrderHelper.confirmOutOrder(orderId);
        loginAction.switchUserAndOrg("18580870001", "666666", 347);
        transferOrderHelper.confirmInOrder(orderId);
        loginAction.logout();
    }

    @Test
    @DisplayName("[Flow]新增调拨（半成品、跨组织）—提交库管-调拨出库-其他组织调拨入库")
    void testFlow_createWithHalfProduct_submit_outAudit_otherOrgInAudit() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.HALF_PRODUCT, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        System.out.println("orderId:" + orderId);
        transferOrderHelper.submit(orderId);
        transferOrderHelper.confirmOutOrder(orderId);
        loginAction.switchUserAndOrg("18580870001", "666666", 347);
        transferOrderHelper.confirmInOrder(orderId);
        loginAction.logout();
    }

    @Test
    @DisplayName("[Flow]新增调拨（原料、跨组织）—取消订单")
    void testFlow_create_cancel() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        transferOrderHelper.cancel(orderId);
    }

    @Test
    @DisplayName("[Flow]新增调拨（原料、跨组织）—确认提交-取消订单")
    void testFlow_create_submit_cancel() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        transferOrderHelper.submit(orderId);
        transferOrderHelper.cancel(orderId);
    }

    @Test
    @DisplayName("[Flow]新增调拨（原料、跨组织）—确认提交-驳回订单")
    void testFlow_create_submit_reject() {
        String orderId = transferOrderHelper.create(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.OrgType.ORG_IMPLEMENTED, "");
        transferOrderHelper.submit(orderId);
        transferOrderHelper.reject(orderId);
    }

}