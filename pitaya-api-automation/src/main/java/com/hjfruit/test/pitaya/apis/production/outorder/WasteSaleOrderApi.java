package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.outorder.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface WasteSaleOrderApi {
    @GraphqlMutation("创建废旧品销售")
    String createWasteSaleOrder(CreateWasteSaleOrderInput createWasteSaleOrderInput);

    @GraphqlQuery("废旧品销售分页列表接口")
    PageWasteSaleOrderPayload pageWasteSaleOrder(PageWasteSaleOrderInput pageWasteSaleOrderInput, Page page);

    @GraphqlQuery("废旧品销售详情接口")
    WasteSaleOrder wasteSaleOrder(GetWasteSaleOrderInput getWasteSaleOrderInput);
}