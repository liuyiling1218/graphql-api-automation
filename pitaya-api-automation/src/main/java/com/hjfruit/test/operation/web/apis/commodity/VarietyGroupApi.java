package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface VarietyGroupApi {
    @GraphqlQuery(" 品种组分页列表")
    PageVarietyGroupPayload pageVarietyGroup(String name, Page page);

    @GraphqlQuery(" 品种组详情")
    VarietyGroup varietyGroupDetail(@Needed Integer id);

    @GraphqlQuery("品种组sku列表")
    PageVarietyGroupSkuPayload pageVarietyGroupSku(@Needed Integer groupId, Page page);

    @GraphqlMutation(" 编辑品种组")
    VarietyGroup updateVarietyGroup(VarietyGroupInput varietyGroupInput);

    @GraphqlMutation(" 新增品种组")
    VarietyGroup createVarietyGroup(VarietyGroupInput varietyGroupInput);

    @GraphqlMutation("批量删除")
    Boolean delVarietyGroupSku(DelVarietyGroupSkuInput delVarietyGroupSkuInput);

    @GraphqlMutation("添加sku")
    Boolean createVarietyGroupSku(CreateVarietyGroupSkuInput createVarietyGroupSkuInput);
}