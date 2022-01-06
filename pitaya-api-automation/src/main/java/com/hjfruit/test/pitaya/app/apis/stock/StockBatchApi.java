package com.hjfruit.test.pitaya.app.apis.stock;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.stock.PageStockBatchInput;
import com.hjfruit.test.pitaya.app.entities.stock.PageStockBatchPayLoad;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface StockBatchApi {
    @GraphqlQuery("商品批次分页查询")
    PageStockBatchPayLoad pageStockBatch(Page page, PageStockBatchInput pageStockBatchInput);
}