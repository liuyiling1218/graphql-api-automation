package com.hjfruit.test.pitaya.app.apis.production.purchasereturn.interfaces;

import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces.*;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type.InStockOrderCommodityPayload;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type.PagePurchaseReturnPayload;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type.PurchaseReturnDetailPayload;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type.PurchaseReturnStatusCountPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface PurchasereturnApi {
    @GraphqlMutation("新增采购退货订单")
    String createPurchaseReturn(PurchaseReturnInsertInput purchaseReturnInsertInput);
    @GraphqlMutation("修改采购退货")
    String updatePurchaseReturn(PurchaseReturnUpdateInput purchaseReturnUpdateInput);
    @GraphqlMutation("取消采购退货")
    String cancelPurchaseReturn(PurchaseReturnCancelInput purchaseReturnCancelInput);
    @GraphqlMutation("提交库管")
    String submitPurchaseReturn(PurchaseReturnSubmitInput purchaseReturnSubmitInput);
    @GraphqlQuery("查询采购退货商品信息")
    List<InStockOrderCommodityPayload> inStockOrderCommodity(QueryOrderCommodityListInput queryOrderCommodityListInput);
    @GraphqlQuery("分页查询退货信息")
    PagePurchaseReturnPayload pagePurchaseReturn(PagePurchaseReturnInput pagePurchaseReturnInput);
    @GraphqlQuery("采购退货详情")
    PurchaseReturnDetailPayload purchaseReturnDetail(PurchaseReturnDetailInput purchaseReturnDetailInput);
    @GraphqlQuery("分状态统计")
    PurchaseReturnStatusCountPayload purchaseReturnStatusCount(PurchaseReturnStatusCountInput purchaseReturnStatusCountInput);
}