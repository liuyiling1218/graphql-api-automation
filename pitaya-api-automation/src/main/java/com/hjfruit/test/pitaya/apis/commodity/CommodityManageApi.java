package com.hjfruit.test.pitaya.apis.commodity;

import com.hjfruit.test.pitaya.entities.Option;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface CommodityManageApi {
    @GraphqlQuery("商品管理列表")
    PageCommodityPayload pageCommodity(PageCommodityInput pageCommodityInput, Page page);

    @GraphqlQuery("品类下拉列表")
    List<Option> categoryOption();

    @GraphqlQuery("商品类型下拉列表")
    List<Option> commodityTypeOption();

    @GraphqlQuery("商品品种下拉列表")
    List<Option> varietyOption(@Needed Integer categoryId);

    @GraphqlQuery("商品产地下拉列表")
    List<Option> originOption(@Needed Integer categoryId);

    @GraphqlQuery("未添加商品列表")
    PageNoCommodityPayload pageNoCommodity(PageNoCommodityInput pageNoCommodityInput, Page page);

    @GraphqlQuery("添加商品")
    List<Integer> createCommodity(List<CreateCommodityInput> createCommodityInput);
}