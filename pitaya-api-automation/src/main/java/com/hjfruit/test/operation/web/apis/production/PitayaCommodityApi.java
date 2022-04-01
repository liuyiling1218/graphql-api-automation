package com.hjfruit.test.operation.web.apis.production;

import com.hjfruit.test.operation.web.entities.Option;
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
public interface PitayaCommodityApi {
    @GraphqlQuery("商品管理列表")
    PitayaPageCommodityPayload pitayaPageCommodityManage(PitayaPageCommodityInput pageCommodityInput, Page page);

    @GraphqlQuery("品类下拉列表")
    List<Option> pitayaCategoryOption();

    @GraphqlQuery("商品类型下拉列表")
    List<Option> pitayaCommodityTypeOption();

    @GraphqlQuery("商品品种下拉列表")
    List<Option> pitayaVarietyOption(@Needed Integer categoryId);

    @GraphqlQuery("商品产地下拉列表")
    List<Option> pitayaOriginOption(@Needed Integer categoryId);

    @GraphqlQuery("未添加商品列表")
    PitayaPageNoCommodityPayload pitayaPageNoCommodity(PitayaPageNoCommodityInput pageNoCommodityInput, Page page);

    @GraphqlMutation("添加商品")
    List<Integer> pitayaCreateCommodity(PitayaListCreateCommodityInput createCommodityInput);

    @GraphqlMutation("商品状态变更")
    List<Integer> pitayaUpdateCommodityStatus(PitayaUpdateCommodityStatusInput updateCommodityStatusInput);
}