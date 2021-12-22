package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 * v1.6
 */
@Data
public class UpdatePlanQuantityInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
    /**
     *
     */
    @Needed
    private String outOrderItemId;
    /**
     *
     */
    @Needed
    private BigDecimal planQuantity;
}