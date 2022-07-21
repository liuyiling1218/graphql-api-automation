package com.hjfruit.test.pitaya.app.apis.production.inorder;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import java.util.List;
import java.math.BigDecimal;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.api.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.type.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.type.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.api.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface InOrderAuditApi {
    @GraphqlQuery("查询入库订单记录条数(入库审核)")
    CountInOrderPayload countInOrderAudit();
    @GraphqlQuery("查询待审核入库订单列表(入库审核)")
    PageInAuditRecordPayload pageAuditInOrder(@Needed Integer commodityType,Page page);
    @GraphqlQuery("查询订单详情(入库审核)")
    AuditInOrderPayload getAuditDetail(InOrderDetailInput inOrderDetailInput);
    @GraphqlQuery("查询订单已入库记录条数")
    Long countInbounded(InOrderDetailInput inOrderDetailInput);
    @GraphqlQuery("入库记录")
    InboundListPayload inboundRecord(InOrderDetailInput inOrderDetailInput);
    @GraphqlQuery("")
    PageInOrderRecordPayload pageInOrderRecord(InOrderRecordFilter inOrderRecordCondition,Page page);
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