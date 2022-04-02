package com.hjfruit.test.operation.web.apis.production;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.production.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface PitayaSortingWarehouseApi {
    @GraphqlQuery("分页查询分拣仓")
    PagePitayaSortingWarehouse pagePitayaSortingWarehouse(PitayaSortingWarehouseInput input, Page page);

    @GraphqlQuery("按名称和手机号搜索负责人")
    List<FindUserPayload> findUser(FindUserInput input);

    @GraphqlMutation("初始化分拣仓")
    Integer createPitayaSortingWarehouse(SortingWarehouseInput input);

    @GraphqlMutation("编辑分拣仓")
    Integer updatePitayaSortingWarehouse(SortingWarehouseInput input);
}