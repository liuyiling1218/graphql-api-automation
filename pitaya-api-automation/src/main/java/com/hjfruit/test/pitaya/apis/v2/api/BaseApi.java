package com.hjfruit.test.pitaya.apis.v2.api;

import com.hjfruit.test.pitaya.entities.v2.types.FreightType;
import com.hjfruit.test.pitaya.entities.v2.types.PayMode;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface BaseApi {
    @GraphqlQuery("")
    List<PayMode> payModes();

    @GraphqlQuery("")
    List<FreightType> freightTypes();
}