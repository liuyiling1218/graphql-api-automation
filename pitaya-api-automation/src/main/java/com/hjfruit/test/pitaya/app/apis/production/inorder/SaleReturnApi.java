package com.hjfruit.test.pitaya.app.apis.production.inorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderItemPayload;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface SaleReturnApi {
    @GraphqlMutation("新增销售退货")
    String createSaleReturn(SaleReturnInsertInput saleReturnInsertInput);
    @GraphqlMutation("修改销售退货")
    Boolean updateSaleReturn(SaleReturnUpdateInput saleReturnUpdateInput);

    @GraphqlQuery("销售退货选择商品")
    List<OutOrderItemPayload> listSaleReturnCommodities(SaleReturnInput saleReturnInput);

    @GraphqlQuery("查询销售退货订单列表")
    PurchasePageResultPayload pageSaleReturn(PageSaleReturnInput pageSaleReturnInput, Page page);

    @GraphqlQuery("查询销售退货订单不同状态记录条数")
    CountPurchasePayload countSaleReturn(CountSaleReturnInput countSaleReturnInput);
    @GraphqlQuery("销售退货入库记录")
    List<InboundListPayload> inboundRecords(@Needed @ID String outOrderId);
}