package com.hjfruit.test.pitaya.app.apis.stock;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.stock.StockConditionInput;
import com.hjfruit.test.pitaya.app.entities.stock.StockPageResultPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface StockApi {
    @GraphqlQuery("")
    StockPageResultPayload pageStock(Page page, StockConditionInput stockConditionInput);
}