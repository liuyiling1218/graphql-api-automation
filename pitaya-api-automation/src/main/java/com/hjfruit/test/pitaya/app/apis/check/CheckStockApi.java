package com.hjfruit.test.pitaya.app.apis.check;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.check.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface CheckStockApi {
    @GraphqlQuery("")
    List<CheckStockPayload> checkStocks(CheckConditionInput checkConditionInput);

    @GraphqlQuery("")
    CheckRecordPageResultPayload checkPageRecords(Page page, CheckRecordConfitionInput checkRecordConfitionInput);

    @GraphqlQuery("")
    CheckInfoPayload checkDetail(Integer checkId);
    @GraphqlQuery("")
    CheckOrderPayload checkOrders(Integer checkId);
    @GraphqlMutation("")
    CheckStockResultPayload finishCheck(CheckInfoInput checkInfoInput);
}