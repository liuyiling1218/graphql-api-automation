package com.hjfruit.test.pitaya.app.apis.plan;

import com.hjfruit.test.pitaya.app.entities.plan.ProductionTaskCommoditiesPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface PlanTaskItemApi {
    @GraphqlQuery("获取成品销售下的商品列表")
    List<ProductionTaskCommoditiesPayload> listSaleOrderCommodities(@ID String outOrderId);
}