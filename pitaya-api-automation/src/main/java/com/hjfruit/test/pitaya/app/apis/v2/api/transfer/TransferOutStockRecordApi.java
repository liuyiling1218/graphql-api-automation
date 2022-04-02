package com.hjfruit.test.pitaya.app.apis.v2.api.transfer;

import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.QueryOutRecordListInput;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.OutStockRecordListPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface TransferOutStockRecordApi {
    @GraphqlQuery("")
    Integer countTransferOutStockRecord(QueryOutRecordListInput queryOutRecordListInput);

    @GraphqlQuery("")
    OutStockRecordListPayload outStockRecordDetail(QueryOutRecordListInput queryOutRecordListInput);
}