package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.TransferBillPayload;
import com.hjfruit.test.pitaya.entities.production.order.*;
import com.hjfruit.test.pitaya.entities.production.outorder.CreateTransferOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.GetTransferOutOrderStatusInput;
import com.hjfruit.test.pitaya.entities.production.outorder.GetTransferOutOrderStatusPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface TransferOutOrderApi {
    @GraphqlMutation("新增调拨出库单")
    String createTransferOutOrder(CreateTransferOrderInput createTransferOrderInput);

    @GraphqlMutation("修改调拨出库单")
    String updateTransferOutOrder(UpdateTransferCommodityInput updateTransferCommodityInput);

    @GraphqlMutation("调拨出库货款单修改")
    String updateTransferOutOrderCommodityBill(UpdateFlowTransferCommodityBillInput updateFlowTransferCommodityBillInput);

    @GraphqlMutation("调拨出库运杂款修改")
    String updateTransferOutOrderOtherBill(UpdateFlowTransferOtherBillInput UpdateFlowTransferOtherBillInput);

    @GraphqlMutation("提交出库费用单审核")
    String updateTransferOutOrderStat(UpdateTransferOrderStatInput updateTransferOrderStatInput);

    @GraphqlQuery("查询调拨出库订单")
    ListTransferOrderPayload listTransferOutOrder(ListTransferOrderInput listTransferOrderInput, Page page);

    @GraphqlQuery("查询调拨出库订单")
    TransferOrderPayload getTransferOutOrder(@ID String flowId);

    @GraphqlQuery("查询调拨出库订单状态值")
    GetTransferOutOrderStatusPayload getTransferOutOrderStatus(GetTransferOutOrderStatusInput getTransferOutOrderStatusInput);

    @GraphqlQuery("查询调拨出库费用订单")
    ListTransferBillPayload listTransferOutOrderFee(ListTransferBillInput listTransferBillInput, Page page);

    @GraphqlQuery("查询调拨出库费用订单详情")
    TransferBillPayload getTransferOutOrderFee(@ID String flowId);

    @GraphqlQuery("查询调拨出库费用单状态值")
    GetTransferOrderFeeStatusPayload getTransferOutOrderFeeStatus(GetTransferOrderFeeStatusInput getTransferOrderFeeStatus);
}