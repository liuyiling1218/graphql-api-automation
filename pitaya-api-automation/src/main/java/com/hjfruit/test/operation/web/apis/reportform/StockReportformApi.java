package com.hjfruit.test.operation.web.apis.reportform;

import com.hjfruit.test.operation.web.entities.reportform.StockReportFormQueryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface StockReportformApi {
    @GraphqlQuery(" 库存导出")
    String exportStock(StockReportFormQueryInput input);
}