package com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 采购退货取消
 */
@Data
public class PurchaseReturnCancelInput {
    /**
     * 采购退货订单Id
     */
    @Needed
    private String purchaseReturnId;
    /**
     * 备注
     */
    @Needed
    private String note;
}