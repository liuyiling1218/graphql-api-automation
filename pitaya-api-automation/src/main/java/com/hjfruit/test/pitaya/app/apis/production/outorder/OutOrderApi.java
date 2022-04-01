package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface OutOrderApi {
    @GraphqlQuery("查询订单详情")
    OutOrderPayload outOrder(OutOrderInput outOrderInput);

    @GraphqlQuery("查询订单商品项")
    List<OutOrderItemPayload> outOrderItems(OutOrderItemsInput outOrderItemsInput);

    @GraphqlQuery("查询订单操作日志")
    List<OutOrderLogPayLoad> outOrderLogs(OutOrderLogsInput outOrderLogsInput);

    @GraphqlQuery("出库申请单分页接口")
    OutOrderPagePayload pageOutOrder(PageOutOrderInput pageOutOrderInput, Page page);

    @GraphqlQuery("状态数量查询接口")
    OutOrderStatusCountPayload countOutOrderStatus(CountOutOrderStatusInput countOutOrderStatusInput);

    @GraphqlQuery("根据出库类型查询待办数量")
    OutOrderTypeCountPayload countOutOrderType(CountOutOrderTypeInput countOutOrderTypeInput);

    @GraphqlQuery("完成出库确认框")
    ConfirmOutOrderStatisticsPayload confirmOutOrderStatistics(@Needed @ID String outOrderId);
}