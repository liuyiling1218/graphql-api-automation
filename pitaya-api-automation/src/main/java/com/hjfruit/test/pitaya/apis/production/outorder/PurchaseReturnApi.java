package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.production.inorder.PurchaseOrderItemPayload;
import com.hjfruit.test.pitaya.entities.production.outorder.InOrderIdInput;
import com.hjfruit.test.pitaya.entities.production.outorder.PurchaseReturnInsertInput;
import com.hjfruit.test.pitaya.entities.production.outorder.PurchaseReturnUpdateInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface PurchaseReturnApi {
    @GraphqlMutation("新增采购退货订单")
    String createPurchaseReturn(PurchaseReturnInsertInput purchaseReturnInsertInput);

    @GraphqlMutation("修改采购退货")
    Boolean updatePurchaseReturn(PurchaseReturnUpdateInput purchaseReturnUpdateInput);

    @GraphqlQuery("查询采购退货商品信息")
    List<PurchaseOrderItemPayload> listPurchaseReturnCommodities(@Needed InOrderIdInput inOrderId);
}