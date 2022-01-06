package com.hjfruit.test.operation.web.apis.reportform;

import com.hjfruit.test.operation.web.entities.reportform.AllocateCostDetailPayload;
import com.hjfruit.test.operation.web.entities.reportform.OutBoundReportFormPageInput;
import com.hjfruit.test.operation.web.entities.reportform.OutBoundReportFormPagePayload;
import com.hjfruit.test.operation.web.entities.reportform.OutBoundReportFormQueryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface OutboundReportformApi {
    @GraphqlQuery(" 列表接口")
    OutBoundReportFormPagePayload pageOutBoundReportForm(OutBoundReportFormPageInput input);

    @GraphqlQuery(" 列表导出")
    String exportOutBoundReportForm(OutBoundReportFormQueryInput input);

    @GraphqlQuery(" 调拨费用单详情")
    AllocateCostDetailPayload getAllocateCostDetail(Integer input);
}