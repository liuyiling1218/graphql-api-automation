package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.Option;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface CommodityCategoryApi {
    @GraphqlQuery("    商品品类下拉接口列表")
    List<Option> listSpuCategoryOption(@Needed Integer commodityTypeId);

    @GraphqlQuery("    品种下拉接口")
    List<Option> listCommodityVarietyOption(@Needed Integer categoryId);

    @GraphqlQuery("    产地下拉接口")
    List<Option> listCommodityOriginOption(@Needed Integer categoryId);
}