package com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 采购退货提交
 */
@Data
public class PurchaseReturnSubmitInput {
    /**
     * 采购退货订单Id
     */
    @Needed
    private String purchaseReturnId;
}