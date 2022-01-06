package com.hjfruit.test.operation.web.apis.reportform;

import com.hjfruit.test.operation.web.entities.reportform.SalesReportFormPageInput;
import com.hjfruit.test.operation.web.entities.reportform.SalesReportFormPagePayload;
import com.hjfruit.test.operation.web.entities.reportform.SalesReportFormQueryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface SalesReportformApi {
    @GraphqlQuery(" 列表接口")
    SalesReportFormPagePayload pageSalesReportForm(SalesReportFormPageInput input);

    @GraphqlQuery(" 列表导出")
    String exportSalesReportForm(SalesReportFormQueryInput input);
}