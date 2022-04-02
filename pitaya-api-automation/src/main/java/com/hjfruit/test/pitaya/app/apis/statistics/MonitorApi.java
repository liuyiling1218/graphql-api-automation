package com.hjfruit.test.pitaya.app.apis.statistics;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface MonitorApi {
    @GraphqlQuery("各状态数量")
    MonitorStatusPayload monitorStatusOption(MonitorStatusInput input);

    @GraphqlQuery("分页查询")
    PageMonitorResult pageMonitor(PageMonitorInput input, Page page);

    @GraphqlQuery("详情")
    MonitorPayload getMonitorDetail(MonitorDetailInput input);
}