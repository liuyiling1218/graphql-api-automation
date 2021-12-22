package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * v1.6
 */
@Data
public class SaleOrderInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
}