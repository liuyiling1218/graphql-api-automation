package com.hjfruit.test.operation.web.apis.peach;

import com.hjfruit.test.operation.web.entities.Option;
import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.peach.*;
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
public interface PeachCommodityApi {
    @GraphqlQuery("商品管理列表")
    PeachPageCommodityPayload peachPageCommodityManage(PeachPageCommodityInput pageCommodityInput, Page page);

    @GraphqlQuery("品类下拉列表")
    List<Option> peachCategoryOption();

    @GraphqlQuery("商品类型下拉列表")
    List<Option> peachCommodityTypeOption();

    @GraphqlQuery("商品品种下拉列表")
    List<Option> peachVarietyOption(@Needed Integer categoryId);

    @GraphqlQuery("商品产地下拉列表")
    List<Option> peachOriginOption(@Needed Integer categoryId);

    @GraphqlQuery("未添加商品列表")
    PeachPageNoCommodityPayload peachPageNoCommodity(PeachPageNoCommodityInput pageNoCommodityInput, Page page);

    @GraphqlMutation("添加商品")
    List<Integer> peachCreateCommodity(PeachListCreateCommodityInput createCommodityInput);

    @GraphqlMutation("商品状态变更")
    List<Integer> peachUpdateCommodityStatus(PeachUpdateCommodityStatusInput updateCommodityStatusInput);
}