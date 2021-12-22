package com.hjfruit.test.pitaya.apis.stock;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.stock.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface StockOutRecordApi {
    @GraphqlQuery("出库记录数量")
    Integer countOutStockRecord(CountOutStockRecordInput countOutStockRecordInput);

    @GraphqlQuery("查询订单出库记录列表")
    List<OutStockRecordPayload> outStockRecords(OutStockRecordsInput outStockRecordsInput);

    @GraphqlQuery("")
    OutStockRecordPayload outStockRecord(OutStockRecordInput outStockRecordInput);

    @GraphqlQuery("出库记录列表（出库记录）")
    PageOutOrderRecordPayload pageOutStockRecord(PageOutStockRecordInput pageOutStockRecordInput, Page page);

    @GraphqlQuery("出库记录日志")
    OutStockRecordLogPayload getOutStockRecordLog(GetOutStockRecordLogInput getOutStockRecordLogInput);
}