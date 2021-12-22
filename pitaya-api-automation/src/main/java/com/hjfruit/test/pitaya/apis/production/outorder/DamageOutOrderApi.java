package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.outorder.CreateDamageOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.OutOrderPagePayload;
import com.hjfruit.test.pitaya.entities.production.outorder.PageDamageOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.UpdateDamageOutOrderInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface DamageOutOrderApi {
    @GraphqlQuery("")
    OutOrderPagePayload pageDamageOutOrder(PageDamageOutOrderInput pageDamageOutOrderInput, Page page);

    @GraphqlMutation("新增报损单")
    String createDamageOutOrder(CreateDamageOutOrderInput createDamageOutOrderInput);

    @GraphqlMutation("修改报损订单")
    Boolean updateDamageOutOrder(UpdateDamageOutOrderInput updateDamageOutOrderInput);
}