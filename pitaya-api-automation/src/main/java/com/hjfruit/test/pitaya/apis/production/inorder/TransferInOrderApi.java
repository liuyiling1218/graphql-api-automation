package com.hjfruit.test.pitaya.apis.production.inorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.GetTransferInOrderStatusInput;
import com.hjfruit.test.pitaya.entities.production.inorder.GetTransferInOrderStatusPayload;
import com.hjfruit.test.pitaya.entities.production.inorder.ListTransferInOrderInput;
import com.hjfruit.test.pitaya.entities.production.inorder.ListTransferInOrderPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface TransferInOrderApi {
    @GraphqlQuery("查询调拨入库订单")
    ListTransferInOrderPayload listTransferInOrder(ListTransferInOrderInput listTransferInOrderInput, Page page);

    @GraphqlQuery("查询调拨入库订单状态值")
    GetTransferInOrderStatusPayload getTransferInOrderStatus(GetTransferInOrderStatusInput getTransferInOrderStatusInput);
}