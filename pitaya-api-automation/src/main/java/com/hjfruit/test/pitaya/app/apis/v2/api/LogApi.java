package com.hjfruit.test.pitaya.app.apis.v2.api;

import com.hjfruit.test.pitaya.app.entities.v2.api.ListLogsInput;
import com.hjfruit.test.pitaya.app.entities.v2.types.ListLogsPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface LogApi {
    @GraphqlQuery("")
    ListLogsPayload listLogs(ListLogsInput listLogsInput);
}