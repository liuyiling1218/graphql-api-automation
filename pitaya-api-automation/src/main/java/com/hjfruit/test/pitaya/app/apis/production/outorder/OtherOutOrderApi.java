package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CreateOtherOutOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderPagePayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.PageOtherOutOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.UpdateOtherOutOrderInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface OtherOutOrderApi {
    @GraphqlMutation("新增其他出单")
    String createOtherOutOrder(CreateOtherOutOrderInput createOtherOutOrderInput);

    @GraphqlMutation("修改其他出库单")
    Boolean updateOtherOutOrder(UpdateOtherOutOrderInput updateOtherOutOrderInput);

    @GraphqlQuery("")
    OutOrderPagePayload pageOtherOutOrder(PageOtherOutOrderInput pageOtherOutOrderInput, Page page);
}