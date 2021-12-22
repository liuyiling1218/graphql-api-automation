package com.hjfruit.test.pitaya.apis.base.time;

import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface TimeApi {
    @GraphqlQuery("")
    Long systemTime();
}