package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * v1.6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
    /**
     *
     */
    @Needed
    private RequestFlag requestFlag;
}