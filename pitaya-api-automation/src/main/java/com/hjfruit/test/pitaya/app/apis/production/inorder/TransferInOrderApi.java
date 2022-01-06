package com.hjfruit.test.pitaya.app.apis.production.inorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.GetTransferInOrderStatusInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.GetTransferInOrderStatusPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.ListTransferOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.order.ListTransferOrderPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.TransferOrderPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface TransferInOrderApi {
    @GraphqlQuery("查询调拨入库订单列表")
    ListTransferOrderPayload listTransferInOrder(ListTransferOrderInput listTransferOrderInput, Page page);

    @GraphqlQuery("查询调拨入库订单")
    TransferOrderPayload getTransferInOrder(@ID String flowId);

    @GraphqlQuery("查询调拨入库订单状态值")
    GetTransferInOrderStatusPayload getTransferInOrderStatus(GetTransferInOrderStatusInput getTransferInOrderStatusInput);
}