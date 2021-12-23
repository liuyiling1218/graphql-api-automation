package com.hjfruit.test.pitaya.app.purchase;

import com.hjfruit.test.pitaya.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.entities.production.inorder.CreateAcquireInput;
import com.hjfruit.test.pitaya.entities.production.inorder.PurchaseConfirmInput;
import com.hjfruit.test.pitaya.entities.production.inorder.SubmitAcquireInput;
import com.hjfruit.test.pitaya.utils.YamlUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class AcquireOrderTest extends PitayaAppBaseTest {

    @Autowired
    AcquireOrderAction acquireOrderAction;
    @Autowired
    InOrderAuditAction inOrderAuditAction;

    @Test
    @DisplayName("辅料采购全部入库正常")
    void createAcquire() {
        //新增辅料采购
        String acquireOrderId = acquireOrderAction.createAcquire(YamlUtil.loadAs("templates/production/inorder/createAcquireInput-accessories.yml", CreateAcquireInput.class));
        //提交库管
        SubmitAcquireInput submitAcquireInput = new SubmitAcquireInput();
        submitAcquireInput.setApplyId(acquireOrderId);
        acquireOrderAction.submitAcquire(submitAcquireInput);
        //全部入库
        PurchaseConfirmInput purchaseConfirmInput = YamlUtil.loadAs(PurchaseConfirmInput.class);
        purchaseConfirmInput.setInOrderId(acquireOrderId);
        inOrderAuditAction.confirmPurchaseInBound(purchaseConfirmInput);
    }
}