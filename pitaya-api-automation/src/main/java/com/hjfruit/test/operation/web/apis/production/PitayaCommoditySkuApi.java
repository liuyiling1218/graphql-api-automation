package com.hjfruit.test.operation.web.apis.production;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.production.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface PitayaCommoditySkuApi {
    @GraphqlQuery("sku详情")
    PitayaCommoditySkuDetailPayload pitayaCommoditySkuDetail(Integer commoditySkuId);

    @GraphqlQuery("sku列表表头")
    PitayaTableHeadPayload pitayaTableHead(Integer commodityId);

    @GraphqlQuery("sku列表")
    PitayaPageSkuPayload pitayaPageSku(PitayaPageSkuInput pageSku, Page page);

    @GraphqlQuery("未选择sku选项id集合")
    List<NotChosenSkuOption> pitayaNotChosenSkuOption(@Needed Integer commodityId);

    @GraphqlMutation("添加sku")
    List<Integer> pitayaCreateCommoditySku(List<Integer> commoditySkuId);

    @GraphqlMutation("编辑sku")
    List<Integer> pitayaUpdateCommoditySku(PitayaUpdateCommoditySkuInput updateCommoditySkuInput);

    @GraphqlMutation("编辑sku状态")
    List<Integer> pitayaUpdateSkuStatus(PitayaUpdateStatusInput updateStatusInput);
}