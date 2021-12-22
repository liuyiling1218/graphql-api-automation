package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface StockApi {
    @GraphqlQuery("")
    List<StockBatchPayload> stockBatches(StockBatchQueryInput stockBatchQueryInput);

    @GraphqlQuery("")
    List<CommodityStockBatchPayload> commodityStockBatches(ListCommodityStockBatchInput listCommodityStockBatchInput);

    @GraphqlQuery("")
    List<SkuStockPayload> skuStocks(ListSkuStockInput stockSkuInput);
}