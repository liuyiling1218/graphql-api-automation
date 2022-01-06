package com.hjfruit.test.pitaya.app.apis.v2.api;

import com.hjfruit.test.pitaya.app.entities.v2.types.FreightType;
import com.hjfruit.test.pitaya.app.entities.v2.types.PayMode;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface BaseApi {
    @GraphqlQuery("")
    List<PayMode> payModes();
    @GraphqlQuery("")
    List<FreightType> freightTypes();
}