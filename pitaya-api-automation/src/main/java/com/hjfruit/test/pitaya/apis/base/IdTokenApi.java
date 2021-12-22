package com.hjfruit.test.pitaya.apis.base;

import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface IdTokenApi {
    @GraphqlQuery("")
    String idempotenceId();
}