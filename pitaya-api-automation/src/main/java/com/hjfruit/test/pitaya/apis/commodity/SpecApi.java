package com.hjfruit.test.pitaya.apis.commodity;

import com.hjfruit.test.pitaya.entities.commodity.CommodityModifyInput;
import com.hjfruit.test.pitaya.entities.commodity.CommoditySpecPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface SpecApi {
    @GraphqlQuery("")
    List<CommoditySpecPayload> specList(Integer commodityId);

    @GraphqlQuery("")
    Boolean verifySpecName(String specName);

    @GraphqlQuery("")
    List<CommoditySpecPayload> listCommoditySpecAndOptionByCommodityId(Integer commodityId);

    @GraphqlMutation("")
    Integer updateSpec(CommodityModifyInput commodityModify);
}