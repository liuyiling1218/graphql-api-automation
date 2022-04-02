package com.hjfruit.test.pitaya.app.apis.production.order;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.TransferBillPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface TransferBillApi {
    @GraphqlQuery("查询调拨费用订单")
    ListTransferBillPayload listTransferBill(ListTransferBillInput listTransferBillInput, Page page);

    @GraphqlQuery("查询调拨费用订单详情")
    TransferBillPayload getTransferBill(@ID String flowId);

    @GraphqlQuery("查询调拨费用单状态值")
    GetTransferOrderFeeStatusPayload getTransferOrderFeeStatus(GetTransferBillStatusInput getTransferBillStatusInput);

    @GraphqlQuery("调拨费用审核角标")
    TransferBillSummaryPayload transferBillSummary();

    @GraphqlMutation("调拨出库货款单修改")
    String updateTransferCommodityBill(UpdateFlowTransferCommodityBillInput updateFlowTransferCommodityBillInput);

    @GraphqlMutation("调拨出库运杂款修改")
    String updateTransferOtherBill(UpdateFlowTransferOtherBillInput updateFlowTransferOtherBillInput);

    @GraphqlMutation("提交出库费用单审核")
    String updateTransferStat(UpdateTransferOrderStatInput updateTransferOrderStatInput);
}