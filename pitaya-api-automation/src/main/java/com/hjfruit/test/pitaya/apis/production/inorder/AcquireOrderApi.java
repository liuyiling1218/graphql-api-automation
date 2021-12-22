package com.hjfruit.test.pitaya.apis.production.inorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface AcquireOrderApi {
    @GraphqlQuery("查询采购订单")
    AcquirePageResultPayload listAcquire(ListAcquireFilter listAcquireFilter, Page page);

    @GraphqlQuery("查询采购订单详情")
    AcquirePayload getAcquire(@Needed GetAcquireInput getAcquireInput);

    @GraphqlQuery("查询采购订单不同状态记录条数")
    CountAcquirePayload countAcquire(CountAcquireFilter countAcquireFilter);

    @GraphqlMutation("新增采购 返回inOrderId")
    String createAcquire(CreateAcquireInput createAcquireInput);

    @GraphqlMutation("修改采购订单")
    Boolean updateAcquire(UpdateAcquireInput updateAcquireInput);

    @GraphqlMutation("提交库管")
    String submitAcquire(@Needed SubmitAcquireInput submitAcquireInput);

    @GraphqlMutation("取消采购订单")
    Boolean cancelAcquire(CancelAcquireInput cancelAcquireInput);
}