package com.hjfruit.test.pitaya.apis.plan;

import com.hjfruit.test.pitaya.entities.plan.PlanChangedSummary;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface PlanChangeSummaryApi {
    @GraphqlQuery("")
    PlanChangedSummary userPlanChangedSummary();
}