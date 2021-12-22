package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.outorder.*;
import fc.test.api.graphql.annotation.*;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface SaleOrderApi {
    @GraphqlQuery("查询销售订单")
    SaleOrderPagePayload pageSaleOrder(QuerySaleOrderInput queryQueryOrderInput, Page page);

    @GraphqlQuery("查询订单详情")
    SaleOrderPayload saleOrder(SaleOrderInput saleOrderInput);

    @GraphqlQuery("状态数量查询接口")
    SaleOrderStatusCountPayload countSaleOrderStatus(CountSaleOrderStatusInput countSaleOrderStatusInput);

    @GraphqlQuery("查询销售退货记录条数 v1.6")
    Long countSaleReturnRecord(SaleOrderInput saleOrderInput);

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

    @GraphqlMutation("更新预估销量 v1.6")
    Boolean updatePlanQuantity(UpdatePlanQuantityInput updatePlanQuantityInput);

    @GraphqlMutation("复制订单")
    String copySaleOrder(SaleOrderInput saleOrderInput);
}