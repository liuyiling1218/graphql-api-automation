package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.outorder.CreateOtherOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.OutOrderPagePayload;
import com.hjfruit.test.pitaya.entities.production.outorder.PageOtherOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.UpdateOtherOutOrderInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface OtherOutOrderApi {
    @GraphqlMutation("新增其他出单")
    String createOtherOutOrder(CreateOtherOutOrderInput createOtherOutOrderInput);

    @GraphqlMutation("修改其他出库单")
    Boolean updateOtherOutOrder(UpdateOtherOutOrderInput updateOtherOutOrderInput);

    @GraphqlQuery("")
    OutOrderPagePayload pageOtherOutOrder(PageOtherOutOrderInput pageOtherOutOrderInput, Page page);
}