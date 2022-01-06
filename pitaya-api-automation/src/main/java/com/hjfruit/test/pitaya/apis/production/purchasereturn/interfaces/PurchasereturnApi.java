package com.hjfruit.test.pitaya.apis.production.purchasereturn.interfaces;

import com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces.*;
import com.hjfruit.test.pitaya.entities.production.purchasereturn.type.InStockOrderCommodityListPayload;
import com.hjfruit.test.pitaya.entities.production.purchasereturn.type.PagePurchaseReturnPayload;
import com.hjfruit.test.pitaya.entities.production.purchasereturn.type.PurchaseReturnDetailPayload;
import com.hjfruit.test.pitaya.entities.production.purchasereturn.type.PurchaseReturnStatusCountPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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
    InStockOrderCommodityListPayload inStockOrderCommodity(QueryOrderCommodityListInput queryOrderCommodityListInput);

    @GraphqlQuery("分页查询退货信息")
    PagePurchaseReturnPayload pagePurchaseReturn(PagePurchaseReturnInput pagePurchaseReturnInput);

    @GraphqlQuery("采购退货详情")
    PurchaseReturnDetailPayload purchaseReturnDetail(PurchaseReturnDetailInput purchaseReturnDetailInput);

    @GraphqlQuery("分状态统计")
    PurchaseReturnStatusCountPayload purchaseReturnStatusCount(PurchaseReturnStatusCountInput purchaseReturnStatusCountInput);
}