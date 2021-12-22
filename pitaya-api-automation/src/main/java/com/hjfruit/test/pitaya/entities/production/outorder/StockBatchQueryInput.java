package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class StockBatchQueryInput {
    /**
     *
     */
    @Needed
    private Integer customerId;
    /**
     *
     */
    @Needed
    private Integer customerType;
    /**
     *
     */
    @Needed
    private Integer commoditySkuId;
    /**
     *
     */
    private Integer commodityTypeId;
}