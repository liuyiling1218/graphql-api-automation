package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface TransferOutOrderApi {
    @GraphqlMutation("新增调拨出库单")
    OutOrderPayload createTransferOutOrder(CreateTransferOutOrderInput createTransferOutOrderInput);

    @GraphqlMutation("修改调拨出库单")
    OutOrderPayload updateTransferOutOrder(UpdateTransferOutOrderInput updateTransferOutOrderInput);

    @GraphqlQuery("查询调拨出库订单")
    OutOrderPagePayload listTransferOutOrder(ListTransferOutOrderInput listTransferOutOrderInput, Page page);

    @GraphqlQuery("查询调拨出库订单状态值")
    GetTransferOutOrderStatusPayload getTransferOutOrderStatus(GetTransferOutOrderStatusInput getTransferOutOrderStatusInput);
}