package com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PurchaseReturnDetailInput {
    /**
     *
     */
    @Needed
    private String purchaseReturnId;
}