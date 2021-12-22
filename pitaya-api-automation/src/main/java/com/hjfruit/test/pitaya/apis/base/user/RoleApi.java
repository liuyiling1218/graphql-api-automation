package com.hjfruit.test.pitaya.apis.base.user;

import com.hjfruit.test.pitaya.entities.base.user.RolePayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface RoleApi {
    @GraphqlQuery("")
    List<RolePayload> roles();
}