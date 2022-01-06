package com.hjfruit.test.pitaya.app.apis.commodity;

import com.hjfruit.test.pitaya.app.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface CommodityQueryApi {
    @GraphqlQuery("")
    List<CommodityCategoryPayload> commodityCategories(ListCommodityCategoryInput listCommodityCategoryInput);
    @GraphqlQuery("")
    List<CommodityPayload> commodities(ListCommodityInput listCommodityInput);
    @GraphqlQuery("")
    List<CommoditySpecPayload> commoditySpecs(ListCommoditySpecInput listCommoditySpecInput);
    @GraphqlQuery("")
    List<CommoditySkuPayload> commoditySkues(ListCommoditySkuInput listCommoditySkuInput);
    @GraphqlQuery("")
    CommoditySkuPayload commoditySku(GetCommoditySkuInput getCommoditySkuInput);
}