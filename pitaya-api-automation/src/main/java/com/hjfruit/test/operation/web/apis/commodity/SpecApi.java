package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.commodity.CommodityModifyInput;
import com.hjfruit.test.operation.web.entities.commodity.CommoditySpecPayload;
import com.hjfruit.test.operation.web.entities.commodity.SpecsInput;
import com.hjfruit.test.operation.web.entities.commodity.SpecsPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface SpecApi {
    @GraphqlQuery("")
    List<CommoditySpecPayload> specList(Integer commodityId);

    @GraphqlQuery("")
    Boolean verifySpecName(String specName);

    @GraphqlQuery("")
    List<CommoditySpecPayload> listCommoditySpecAndOptionByCommodityId(Integer commodityId);

    @GraphqlQuery(" 规格列表")
    List<SpecsPayload> specs(SpecsInput specsInput);

    @GraphqlMutation("")
    Integer updateSpec(CommodityModifyInput commodityModifyInput);
}