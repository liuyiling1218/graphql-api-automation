package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * v1.6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRealQuantityInput {
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
    private BigDecimal realQuantity;
}