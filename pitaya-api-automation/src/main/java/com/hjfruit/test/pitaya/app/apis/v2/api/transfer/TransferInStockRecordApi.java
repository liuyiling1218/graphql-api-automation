package com.hjfruit.test.pitaya.app.apis.v2.api.transfer;

import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.InStockOrderDetailInput;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.QueryRecordListInput;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.InStockRecordListPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface TransferInStockRecordApi {
    @GraphqlQuery("")
    Integer countTransferInStockRecord(QueryRecordListInput queryRecordListInput);

    @GraphqlQuery("")
    InStockRecordListPayload transferInStockRecordDetail(InStockOrderDetailInput inStockOrderDetailInput);
}