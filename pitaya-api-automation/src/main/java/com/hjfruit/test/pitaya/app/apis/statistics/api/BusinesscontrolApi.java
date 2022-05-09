package com.hjfruit.test.pitaya.app.apis.statistics.api;

import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.statistics.api.ListBusinessInput;
import com.hjfruit.test.pitaya.app.entities.statistics.type.BusinessPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface BusinesscontrolApi {
    @GraphqlQuery("")
    List<BusinessPayload> listBusiness(ListBusinessInput input);

    @GraphqlQuery("")
    List<Option> listOrgChannel();
}