package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.order.ListTransferOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.order.ListTransferOrderPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.TransferOrderPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.UpdateTransferCommodityInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface TransferOutOrderApi {
    @GraphqlMutation("新增调拨出库单")
    String createTransferOutOrder(CreateTransferOrderInput createTransferOrderInput);

    @GraphqlMutation("修改调拨出库单")
    String updateTransferOutOrder(UpdateTransferCommodityInput updateTransferCommodityInput);

    @GraphqlQuery("查询调拨出库订单")
    ListTransferOrderPayload listTransferOutOrder(ListTransferOrderInput listTransferOrderInput, Page page);

    @GraphqlQuery("查询调拨出库订单")
    TransferOrderPayload getTransferOutOrder(@ID String flowId);

    @GraphqlQuery("查询调拨出库订单状态值")
    GetTransferOutOrderStatusPayload getTransferOutOrderStatus(GetTransferOutOrderStatusInput getTransferOutOrderStatusInput);

    @GraphqlQuery("调入选项下拉")
    List<TransferOptionsPayload> listTransferOptions();

    @GraphqlQuery("调拨组织列表")
    List<ListTransferOrgListPayload> listTransferOrgList(ListTransferOrgListInput listTransferOrgListInput);
}