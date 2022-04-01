package com.hjfruit.test.pitaya.app.apis.plan;

import com.hjfruit.test.pitaya.app.entities.plan.PlanChangedSummary;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface PlanChangeSummaryApi {
    @GraphqlQuery("")
    PlanChangedSummary userPlanChangedSummary();
}