package com.hjfruit.test.pitaya.app.apis.base.customer;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface CustomerApi {
    @GraphqlQuery("")
    CustomerPagePayload customers(Page page, CustomersInput customersInput);

    @GraphqlQuery("")
    CustomerPayload customer(Integer customerId);

    @GraphqlQuery("")
    List<CustomerPayload> listCustomer(CustomerListInput customerListInput);

    @GraphqlQuery("")
    List<CustomerPayload> allListCustomer();

    @GraphqlQuery("")
    List<CustomerGroupPayload> customerGroups();

    @GraphqlQuery("")
    CustomerPayload orgCustomer();

    @GraphqlMutation("")
    Integer createCustomer(CustomerInput customerInput);

    @GraphqlMutation("")
    Integer updateCustomer(CustomerInput customerInput);

    @GraphqlMutation("")
    Integer deleteCustomer(Integer customerId);

    @GraphqlMutation("")
    Integer createCustomerDistribution(CustomerDistributionInput customerDistributionInput);

    @GraphqlMutation("")
    Integer updateCustomerDistribution(CustomerDistributionInput customerDistributionInput);

    @GraphqlMutation("")
    Integer deleteCustomerDistribution(Integer distributionId);
}