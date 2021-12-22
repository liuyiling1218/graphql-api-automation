package com.hjfruit.test.pitaya.apis.check;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.check.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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