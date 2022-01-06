package com.hjfruit.test.operation.web.apis.stock;

import com.hjfruit.test.operation.web.entities.stock.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface StockRecordApi {
    @GraphqlQuery(" 分页查询盘点记录")
    PageTakeStockRecordListPayload pageTakeStockRecord(TakeStockRecordInput input);

    @GraphqlQuery(" 根据盘点记录id获取本次盘点详情")
    TakeStockRecordDetailPayload getTakeStockRecordDetail(TakeStockRecordDetailInput input);

    @GraphqlQuery("仓库下拉列表")
    List<WarehouseOptionPayload> listWarehouseOption(WarehouseOptionInput input);

    @GraphqlQuery(" 出入库记录类型下拉")
    StockTypeOptionPayload listStockTypeOption(StockTypeOptionInput input);

    @GraphqlQuery(" 导出在售库存报表")
    String exportStockInSaleReportForm(StockInSaleReportQueryInput input);
}