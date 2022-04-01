package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface WasteSaleOrderApi {
    @GraphqlMutation("创建废旧品销售")
    String createWasteSaleOrder(CreateWasteSaleOrderInput createWasteSaleOrderInput);

    @GraphqlQuery("废旧品销售分页列表接口")
    PageWasteSaleOrderPayload pageWasteSaleOrder(PageWasteSaleOrderInput pageWasteSaleOrderInput, Page page);

    @GraphqlQuery("废旧品销售详情接口")
    WasteSaleOrder wasteSaleOrder(GetWasteSaleOrderInput getWasteSaleOrderInput);
}