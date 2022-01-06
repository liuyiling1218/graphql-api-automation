package com.hjfruit.test.operation.web.apis.reportform;

import com.hjfruit.test.operation.web.entities.reportform.OrderReportFormPageInput;
import com.hjfruit.test.operation.web.entities.reportform.OrderReportFormPagePayload;
import com.hjfruit.test.operation.web.entities.reportform.OrderReportFormQueryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface OrderReportformApi {
    @GraphqlQuery(" 列表接口")
    OrderReportFormPagePayload pageOrderReportForm(OrderReportFormPageInput input);

    @GraphqlQuery(" 列表导出")
    String exportOrderReportForm(OrderReportFormQueryInput input);
}