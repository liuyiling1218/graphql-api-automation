package com.hjfruit.test.operation.web.apis.production;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.production.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface PitayaCommodityBomApi {
    @GraphqlQuery("bom列表")
    PitayaCommodityBomPagePayload pitayaPageCommodityBom(String commodityName, Page page);

    @GraphqlQuery("条件获取sku列表")
    PitayaConditionToGetSkuPayload pitayaPageConditionToGetSku(PitayaConditionToGetSkuInput conditionToGetSkuInput, Page page);

    @GraphqlQuery("根据bom id获取配料列表")
    List<PitayaBomDetailPayload> pitayaListBurden(Integer bomId);

    @GraphqlMutation("新增bom")
    Integer pitayaSaveCommodityBom(PitayaSaveBomInput saveCommodityBomInput);

    @GraphqlMutation("修改bom")
    Integer pitayaUpdateCommodityBom(PitayaUpdateBomInput updateCommodityBomInput);

    @GraphqlMutation("删除bom")
    Boolean pitayaDeleteCommodityBom(Integer bomId);
}