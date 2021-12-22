package com.hjfruit.test.pitaya.apis.stock;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.stock.StockConditionInput;
import com.hjfruit.test.pitaya.entities.stock.StockPageResultPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface StockApi {
    @GraphqlQuery("")
    StockPageResultPayload pageStock(Page page, StockConditionInput stockConditionInput);
}