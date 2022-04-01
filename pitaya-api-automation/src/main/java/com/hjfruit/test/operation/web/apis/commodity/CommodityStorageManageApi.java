package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.commodity.PageQueryStorageConditionInput;
import com.hjfruit.test.operation.web.entities.commodity.StorageConditionPageResult;
import com.hjfruit.test.operation.web.entities.commodity.UpdateStorageConditionsInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface CommodityStorageManageApi {
    @GraphqlMutation("更新商品存储管理条件")
    String doUpdateStorageConditions(UpdateStorageConditionsInput updateStorageConditionsInput);

    @GraphqlQuery("查询商品存储管理条件【分页】")
    StorageConditionPageResult pageQueryStorageConditions(PageQueryStorageConditionInput pageQueryStorageConditionInput);
}