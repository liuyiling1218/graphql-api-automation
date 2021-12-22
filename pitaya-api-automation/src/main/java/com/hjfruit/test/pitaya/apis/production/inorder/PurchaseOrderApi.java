package com.hjfruit.test.pitaya.apis.production.inorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.*;
import fc.test.api.graphql.annotation.*;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface PurchaseOrderApi {
    @GraphqlQuery("查询采购订单")
    PurchasePageResultPayload purchaseList(PurchaseListFilter listCondition, Page page);

    @GraphqlQuery("查询采购订单详情")
    PurchaseOrderPayload purchaseDetail(@Needed @ID String inOrderId);

    @GraphqlQuery("查询采购订单不同状态记录条数")
    CountPurchasePayload countPurchase(CountPurchaseFilter countPurchaseFilter);

    @GraphqlMutation("新增采购 返回inOrderId")
    String insertPurchase(PurchaseOrderInsertInput purchaseOrderInsert);

    @GraphqlMutation("提交库管")
    String submitPurchase(@Needed @ID String inOrderId);

    @GraphqlMutation("修改采购订单")
    Boolean modifyPurchase(PurchaseOrderUpdateInput purchaseOrderUpdate);

    @GraphqlMutation("取消采购订单")
    Boolean cancelPurchase(CancelInOrderInput cancelpurchase);
}