package com.hjfruit.test.pitaya.apis.stock;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.stock.PageStockBatchInput;
import com.hjfruit.test.pitaya.entities.stock.PageStockBatchPayLoad;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface StockBatchApi {
    @GraphqlQuery("商品批次分页查询")
    PageStockBatchPayLoad pageStockBatch(Page page, PageStockBatchInput pageStockBatchInput);
}