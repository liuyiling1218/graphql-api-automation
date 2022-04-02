package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 采购退货取消
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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