package com.hjfruit.test.pitaya.apis.production.inorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.*;
import fc.test.api.graphql.annotation.*;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface OtherInOrderApi {
    @GraphqlMutation("新增采购 返回inOrderId")
    String createOtherInOrder(CreateOtherInOrderInput createOtherInOrderInput);

    @GraphqlMutation("提交库管")
    String submitOtherInOrder(@Needed @ID String inOrderId);

    @GraphqlMutation("修改采购订单")
    Boolean modifyOtherInOrder(ModifyOtherInOrderInput modifyOtherInOrderInput);

    @GraphqlMutation("取消采购订单")
    Boolean cancelOtherInOrder(CancelOtherInOrderInput cancelOtherInOrderInput);

    @GraphqlQuery("查询其他入库订单")
    PageOtherInOrderPayload pageOtherInOrder(PageOtherInOrderInput pageOtherInOrderInput, Page page);
}