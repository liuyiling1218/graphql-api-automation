package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class CountSaleOrderStatusInput {
    /**
     *
     */
    @Needed
    private Long saleTime;
}