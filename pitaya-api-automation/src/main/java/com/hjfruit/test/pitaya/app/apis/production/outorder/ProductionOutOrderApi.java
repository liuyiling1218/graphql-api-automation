package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.production.order.OrderStatusStatisticsInput;
import com.hjfruit.test.pitaya.app.entities.production.order.OrderStatusStatisticsPayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderUpdateInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.ProductionOutOrderListInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.ProductionOutOrderLogPayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.ProductionOutOrderPayload;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface ProductionOutOrderApi {
    @GraphqlQuery("查询全部出库订单")
    List<ProductionOutOrderPayload> outOrderList(@Needed ProductionOutOrderListInput productionOutOrderListInput);

    @GraphqlQuery("出库订单列表数量统计")
    OrderStatusStatisticsPayload outOrderStatusStatistics(OrderStatusStatisticsInput orderStatusStatisticsInput);

    @GraphqlQuery("查询出库订单详情")
    ProductionOutOrderPayload outOrderDetail(@Needed @ID String outOrderId);

    @GraphqlQuery("查询出库订单记录")
    List<ProductionOutOrderLogPayload> outOrderLog(@Needed @ID String outOrderId);

    @GraphqlMutation("修改出库订单")
    Boolean modifyOutOrder(@Needed OutOrderUpdateInput outOrderUpdateInput);
}