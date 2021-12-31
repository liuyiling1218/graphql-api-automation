package com.hjfruit.test.pitaya.apis.production.inorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.GetTransferInOrderStatusInput;
import com.hjfruit.test.pitaya.entities.production.inorder.GetTransferInOrderStatusPayload;
import com.hjfruit.test.pitaya.entities.production.inorder.TransferBillPayload;
import com.hjfruit.test.pitaya.entities.production.order.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface TransferInOrderApi {
    @GraphqlQuery("查询调拨入库订单列表")
    ListTransferOrderPayload listTransferInOrder(ListTransferOrderInput listTransferOrderInput, Page page);

    @GraphqlQuery("查询调拨入库订单")
    TransferOrderPayload getTransferInOrder(@ID String flowId);

    @GraphqlQuery("查询调拨入库订单状态值")
    GetTransferInOrderStatusPayload getTransferInOrderStatus(GetTransferInOrderStatusInput getTransferInOrderStatusInput);

    @GraphqlQuery("查询调拨入库费用订单列表")
    ListTransferBillPayload listTransferInOrderFee(ListTransferBillInput listTransferBillInput, Page page);

    @GraphqlQuery("查询调拨入库费用订单详情")
    TransferBillPayload getTransferInOrderFee(@ID String flowId);

    @GraphqlQuery("查询调拨入库费用单状态值")
    GetTransferOrderFeeStatusPayload getTransferInOrderFeeStatus(GetTransferOrderFeeStatusInput getTransferOrderFeeStatus);

    @GraphqlMutation("调拨入库货款单修改    updateTransferInOrderCommodityBill(updateFlowTransferCommodityBillInput:UpdateFlowTransferCommodityBillInput):ID调拨入库运杂款修改")
    String updateTransferInOrderOtherBill(UpdateFlowTransferOtherBillInput updateFlowTransferOtherBillInput);

    @GraphqlMutation("提交入库费用单审核")
    String updateTransferInOrderStat(UpdateTransferOrderStatInput updateTransferOrderStatInput);
}