package com.hjfruit.test.pitaya.app.apis.production.inorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface OtherInOrderApi {
    @GraphqlMutation("新增其他入库 返回inOrderId")
    String createOtherInOrder(CreateOtherInOrderInput createOtherInOrderInput);

    @GraphqlMutation("提交库管")
    String submitOtherInOrder(@Needed @ID String inOrderId);

    @GraphqlMutation("修改其他入库订单")
    Boolean modifyOtherInOrder(ModifyOtherInOrderInput modifyOtherInOrderInput);

    @GraphqlMutation("取消其他入库订单")
    Boolean cancelOtherInOrder(CancelOtherInOrderInput cancelOtherInOrderInput);

    @GraphqlQuery("查询其他入库订单")
    PageOtherInOrderPayload pageOtherInOrder(PageOtherInOrderInput pageOtherInOrderInput, Page page);
}