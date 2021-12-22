package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.production.outorder.IgnoreTaskSaleChangeInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface SaleChangeApi {
    @GraphqlMutation(" 任务忽略")
    String ignoreTaskSaleChange(IgnoreTaskSaleChangeInput ignoreTaskSaleChangeInput);
}