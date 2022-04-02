package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 采购退货提交
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseReturnSubmitInput {
    /**
     * 采购退货订单Id
     */
    @Needed
    private String purchaseReturnId;
}