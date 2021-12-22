package com.hjfruit.test.pitaya.apis.commodity;

import com.hjfruit.test.pitaya.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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