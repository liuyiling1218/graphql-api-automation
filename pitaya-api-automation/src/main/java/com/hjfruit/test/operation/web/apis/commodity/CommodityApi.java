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
public interface CommodityApi {
    @GraphqlQuery("    商品分页列表")
    CommodityPageResult pageCommodity(String commodityName, Page page);

    @GraphqlQuery("    查询商品信息")
    CommodityDetailPayload getCommodity(Integer commodityId);

    @GraphqlQuery("    商品名称重复验证")
    Boolean isSpuNameRepeat(UpdateCommodityNameInput updateCommodityNameInput);

    @GraphqlQuery("商品分类下拉列表")
    List<Option> typeOption();

    @GraphqlQuery("根据条件获取商品选项列表")
    List<Option> commodityOption(SpecsInput specsInput);

    @GraphqlMutation("    新增商品")
    Integer doInsertCommodity(InsertCommodityInput insertCommodityInput);

    @GraphqlMutation("    修改商品名称")
    Integer doUpdateCommodityName(UpdateCommodityNameInput updateCommodityNameInput);
}