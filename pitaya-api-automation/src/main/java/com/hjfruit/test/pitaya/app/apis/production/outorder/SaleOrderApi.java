package com.hjfruit.test.pitaya.app.apis.production.outorder;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import java.util.List;
import java.math.BigDecimal;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface SaleOrderApi {
    @GraphqlQuery("查询销售订单")
    SaleOrderPagePayload pageSaleOrder(QuerySaleOrderInput queryQueryOrderInput,Page page);
    @GraphqlQuery("")
    SaleOrderPayload saleOrder(SaleOrderInput saleOrderInput);
    @GraphqlQuery("状态数量查询接口")
    SaleOrderStatusCountPayload countSaleOrderStatus(CountSaleOrderStatusInput countSaleOrderStatusInput);
    @GraphqlQuery("查询销售退货记录条数 v1.6")
    Long countSaleReturnRecord(SaleOrderInput saleOrderInput);
    @GraphqlQuery("")
    Integer saleRejectStatistic();
    @GraphqlQuery("")
    CheckIfPickingPayload checkIfPicking(CheckIfPickingInput checkIfPickingInput);
    @GraphqlMutation("新增销售")
    String createSaleOrder(CreateSaleOrderInput createSaleOrderInput);
    @GraphqlMutation("提交生产")
    Boolean submitSaleOrder(@Needed @ID String outOrderId);
    @GraphqlMutation("修改销售订单")
    Boolean updateSaleOrder(UpdateSaleOrderInput updateSaleOrderInput);
    @GraphqlMutation("取消销售订单")
    Boolean cancelSaleOrder(CancelOutOrderInput cancelOutOrderInput);
    @GraphqlMutation("撤销生产")
    Boolean undoSaleOrder(UndoSaleOrderInput undoSaleOrderInput);
    @GraphqlMutation("更新实际销量 v1.6")
    Boolean updateRealQuantity(UpdateRealQuantityInput updateRealQuantityInput);
    @GraphqlMutation("")
    Boolean updatePlanQuantity(UpdatePlanQuantityInput updatePlanQuantityInput);
    @GraphqlMutation("复制订单")
    String copySaleOrder(SaleOrderInput saleOrderInput);
    @GraphqlMutation("")
    CancelSaleProductionPayload cancelSaleProduction(CancelSaleProductionInput cancelSaleProductionInput);
    @GraphqlMutation("")
    RejectNoticeEmptiedPayload rejectNoticeEmptied(RejectNoticeEmptiedInput rejectNoticeEmptiedInput);
}