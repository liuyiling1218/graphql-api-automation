package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.Option;
import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface CommoditySkuApi {
    @GraphqlQuery("    sku列表表头")
    List<SkuColumnSpecPayload> listSkuListColumn(Integer commodityId);

    @GraphqlQuery("    sku列表筛选项")
    List<SkuOptionsPayLoad> listSkuQueryCondition(Integer commodityId);

    @GraphqlQuery("    sku列表")
    SkuPagePayload pageSku(SkuListConditionInput skuListConditionInput);

    @GraphqlQuery("    sku详情")
    SkuDetailPayload getSkuDetail(List<Integer> commodityId);

    @GraphqlQuery("    单位下拉列表")
    List<Option> listUnitOptions(Integer commodityTypeId);

    @GraphqlQuery("sku属性下拉")
    List<Option> listPropertyOptions(Integer commodityTypeId);

    @GraphqlQuery("    已选择sku列表")
    List<List<Integer>> listSkuSelectedCombination(Integer commodityId);

    @GraphqlQuery("品种组sku选择列表")
    SkuPagePayload pageGroupSku(GroupSkuInput groupSkuInput, Page page);

    @GraphqlMutation("新增sku")
    List<Integer> doSaveSkuList(CommoditySkuInputSave commoditySkus);
}