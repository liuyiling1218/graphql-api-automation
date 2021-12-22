package com.hjfruit.test.pitaya.apis.base.config;

import com.hjfruit.test.pitaya.entities.base.config.ProductionConfigPayload;
import com.hjfruit.test.pitaya.entities.base.config.SaveConfigInput;
import com.hjfruit.test.pitaya.entities.base.config.SaveSalaryInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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