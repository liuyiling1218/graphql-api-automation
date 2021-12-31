package com.hjfruit.test.pitaya.actions.production.inorder;


import com.hjfruit.test.pitaya.apis.production.inorder.InOrderAuditApi;
import com.hjfruit.test.pitaya.entities.production.inorder.AuditInOrderPayload;
import com.hjfruit.test.pitaya.entities.production.inorder.ConfirmInput;
import com.hjfruit.test.pitaya.entities.production.inorder.InOrderDetailInput;
import com.hjfruit.test.pitaya.entities.production.inorder.PurchaseConfirmInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class InOrderAuditAction {
    @Autowired
    InOrderAuditApi inOrderAuditApi;

    /**
     * 采购确定入库
     *
     * @param purchaseConfirmInput
     * @return
     */
    public Long confirmPurchaseInBound(PurchaseConfirmInput purchaseConfirmInput) {
        Long aLong = inOrderAuditApi.confirmPurchaseInBound(purchaseConfirmInput);
        /*
         * 断言：
         * 1. 产生入库记录
         * 2.
         */
        return aLong;
    }
        /**
         * 确认入库
         */
    public Long confirmInbound(ConfirmInput confirmInput) {
        Long id = inOrderAuditApi.confirmInbound(confirmInput);
        assertThat(id).isNotNull();
        return id;
    }
        /**
        *查看入库详情
        */
       public AuditInOrderPayload getAuditDetail(InOrderDetailInput inOrderDetailInput){
           AuditInOrderPayload auditDetail = inOrderAuditApi.getAuditDetail(inOrderDetailInput);
           return auditDetail;
       }
}