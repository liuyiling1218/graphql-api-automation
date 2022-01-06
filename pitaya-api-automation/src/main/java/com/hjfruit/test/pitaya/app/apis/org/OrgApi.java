package com.hjfruit.test.pitaya.app.apis.org;

import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface OrgApi {
    @GraphqlQuery("获取组织树")
    String orgTree(String input);
}