package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface StockApi {
    @GraphqlQuery("")
    List<StockBatchPayload> stockBatches(StockBatchQueryInput stockBatchQueryInput);

    @GraphqlQuery("")
    List<CommodityStockBatchPayload> commodityStockBatches(ListCommodityStockBatchInput listCommodityStockBatchInput);

    @GraphqlQuery("")
    List<SkuStockPayload> skuStocks(ListSkuStockInput stockSkuInput);
}