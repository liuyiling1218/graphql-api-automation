package com.hjfruit.test.pitaya.app.apis.base.user;

import com.hjfruit.test.pitaya.app.entities.base.user.RolePayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface RoleApi {
    @GraphqlQuery("")
    List<RolePayload> roles();
}