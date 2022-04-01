package com.hjfruit.test.pitaya.app.apis.production.inorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface InOrderAuditApi {
    @GraphqlQuery("查询入库订单记录条数(入库审核)")
    CountInOrderPayload countInOrderAudit();

    @GraphqlQuery("查询待审核入库订单列表(入库审核)")
    PageInAuditRecordPayload pageAuditInOrder(@Needed Integer commodityType, Page page);

    @GraphqlQuery("查询订单详情(入库审核)")
    AuditInOrderPayload getAuditDetail(InOrderDetailInput inOrderDetailInput);

    @GraphqlQuery("查询订单已入库记录条数")
    Long countInbounded(InOrderDetailInput inOrderDetailInput);

    @GraphqlQuery("入库记录")
    InboundListPayload inboundRecord(InOrderDetailInput inOrderDetailInput);

    @GraphqlQuery("入库记录列表（入库记录）")
    PageInOrderRecordPayload pageInOrderRecord(InOrderRecordFilter inOrderRecordCondition, Page page);

    @GraphqlQuery("获取入库记录详情（入库记录）")
    InOrderRecordDetailPayload getInOrderRecordDetail(InOrderDetailInput inOrderDetailInput);

    @GraphqlQuery("采购入库记录")
    ProductionInOrderLogListPayload purchaseInOrderLog(@Needed @ID String inOrderId);

    @GraphqlMutation("驳回订单")
    Boolean rejectedInOrderAudit(RejectedInput rejectedInput);

    @GraphqlMutation("完成入库")
    Boolean finishInbound(@Needed @ID String inOrderId);

    @GraphqlMutation("确认入库 返回订单状态")
    Long confirmInbound(ConfirmInput confirmInput);

    @GraphqlMutation("采购确定入库")
    Long confirmPurchaseInBound(PurchaseConfirmInput purchaseConfirmInput);

    @GraphqlMutation("采购入库驳回订单")
    Boolean rejectPurchaseOrderAudit(RejectedInput rejectedInput);

    @GraphqlMutation("采购完成入库")
    Boolean finishPurchaseOrderInBound(@Needed @ID String inOrderId);
}