package com.hjfruit.test.pitaya.apis.statistics;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.statistics.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface OverviewApi {
    @GraphqlQuery("状态数量统计")
    OverviewStatusPayload overviewStatusOption(OverviewStatusInput input);

    @GraphqlQuery("分页查询概览")
    PageOverviewResult pageOverview(PageOverviewInput input, Page page);

    @GraphqlQuery("详情")
    OverviewPayload getOverviewDetail(OverviewDetailInput input);
}