package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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