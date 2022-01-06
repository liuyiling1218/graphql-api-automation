package com.hjfruit.test.pitaya.app.apis.base.config;

import com.hjfruit.test.pitaya.app.entities.base.config.ProductionConfigPayload;
import com.hjfruit.test.pitaya.app.entities.base.config.SaveConfigInput;
import com.hjfruit.test.pitaya.app.entities.base.config.SaveSalaryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface ProductionConfigApi {
    @GraphqlQuery("")
    List<ProductionConfigPayload> getWorkerSalary();
    @GraphqlQuery("")
    ProductionConfigPayload getProductionConfig();
    @GraphqlMutation("")
    Integer saveWorkerSalary(SaveSalaryInput saveWorkerSalary);
    @GraphqlMutation("")
    Integer saveProductionConfig(SaveConfigInput saveConfigInput);
}