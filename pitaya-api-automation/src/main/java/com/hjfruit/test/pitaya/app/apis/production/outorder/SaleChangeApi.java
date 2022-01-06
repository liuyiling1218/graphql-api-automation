package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.production.outorder.IgnoreTaskSaleChangeInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface SaleChangeApi {
    @GraphqlMutation(" 任务忽略")
    String ignoreTaskSaleChange(IgnoreTaskSaleChangeInput ignoreTaskSaleChangeInput);
}