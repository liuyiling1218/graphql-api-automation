package com.hjfruit.test.pitaya.apis.commodity;

import com.hjfruit.test.pitaya.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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