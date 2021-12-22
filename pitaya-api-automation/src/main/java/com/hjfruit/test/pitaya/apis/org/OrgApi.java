package com.hjfruit.test.pitaya.apis.org;

import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface OrgApi {
    @GraphqlQuery("获取组织树")
    String orgTree(String input);
}