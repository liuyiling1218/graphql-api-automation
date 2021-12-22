package com.hjfruit.test.pitaya.apis.statistics;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.statistics.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface MonitorApi {
    @GraphqlQuery("各状态数量")
    MonitorStatusPayload monitorStatusOption(MonitorStatusInput input);

    @GraphqlQuery("分页查询")
    PageMonitorResult pageMonitor(PageMonitorInput input, Page page);

    @GraphqlQuery("详情")
    MonitorPayload getMonitorDetail(MonitorDetailInput input);
}