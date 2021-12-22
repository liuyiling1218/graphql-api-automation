package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class SaleReturnInput {
    /**
     * 销售订单Id
     */
    @Needed
    private String outOrderId;
}