package com.hjfruit.test.pitaya.app.apis.commodity;

import com.hjfruit.test.pitaya.app.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface SubsidiaryApi {
    @GraphqlQuery("")
    SubsidiaryPagePayload subsidiaryPageResult(SubsidiaryPageInput subsidiaryPageInput);

    @GraphqlQuery("")
    SubsidiaryDetailPayload subsidiary(Integer subsidiaryId);

    @GraphqlQuery("")
    Integer subsidiaryNameRepeat(SubsidiaryRepeatInput subsidiaryRepeatInput);

    @GraphqlMutation("")
    Integer insertSubsidiary(SubsidiaryDetailInput subsidiaryDetailInput);

    @GraphqlMutation("")
    Integer updateSubsidiary(SubsidiaryDetailInput subsidiaryDetailInput);

    @GraphqlMutation("")
    Integer updateSubsidiaryStatus(SubsidiaryStatusInput subsidiaryStatusInput);
}