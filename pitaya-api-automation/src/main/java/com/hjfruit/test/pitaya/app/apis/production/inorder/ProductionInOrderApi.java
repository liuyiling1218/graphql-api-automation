package com.hjfruit.test.pitaya.app.apis.production.inorder;

import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.production.order.OrderStatusStatisticsInput;
import com.hjfruit.test.pitaya.app.entities.production.order.OrderStatusStatisticsPayload;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface ProductionInOrderApi {
    @GraphqlQuery("查询全部入库订单")
    ProductionInOrderListPayload inOrderList(@Needed ProductionInOrderListInput productionInOrderListInput);

    @GraphqlQuery("出库订单列表数量统计")
    OrderStatusStatisticsPayload inOrderStatusStatistics(OrderStatusStatisticsInput orderStatusStatisticsInput);

    @GraphqlQuery("单个入库订单详情")
    ProductionInOrderPayload inOrderDetail(@Needed @ID String inOrderId);

    @GraphqlQuery("入库订单记录")
    ProductionInOrderLogListPayload inOrderLog(@Needed @ID String inOrderId);

    @GraphqlQuery("原料/辅料退料->信息保存")
    String insertMaterialReturns(InsertMaterialReturnsInput insertMaterialReturnsInput);

    @GraphqlMutation("修改入库订单")
    String modifyInOrder(@Needed InOrderUpdate inOrderUpdate);

    @GraphqlMutation("取消入库订单")
    String cancelInOrder(@Needed CancelInOrderInput cancelInOrderInput);

    @GraphqlMutation("入库订单提交库管")
    String submitInOrder(@Needed @ID String inOrderId);
}