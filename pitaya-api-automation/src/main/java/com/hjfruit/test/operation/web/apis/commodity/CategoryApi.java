package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.commodity.Category;
import com.hjfruit.test.operation.web.entities.commodity.CategoryInput;
import com.hjfruit.test.operation.web.entities.commodity.CategoryPage;
import com.hjfruit.test.operation.web.entities.commodity.PageCategoryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface CategoryApi {
    @GraphqlQuery(" 品类详情数据【分页】")
    CategoryPage pageCategoryDetails(PageCategoryInput pageCategoryInput);

    @GraphqlQuery(" 根据categoryId 获取详情")
    Category categoryDetail(@Needed Integer categoryId);

    @GraphqlQuery("    品类总数")
    Long countCategory();

    @GraphqlMutation(" 创建商品分类")
    Category createCategory(CategoryInput categoryInput);

    @GraphqlMutation(" 修改商品分类")
    Category updateCategory(CategoryInput categoryInput);

    @GraphqlMutation(" 删除商品分类接口")
    Boolean deleteCategory(@Needed Integer categoryId);
}