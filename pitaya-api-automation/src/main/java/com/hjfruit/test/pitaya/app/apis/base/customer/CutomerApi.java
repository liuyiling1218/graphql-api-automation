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
public interface CutomerApi {
    @GraphqlQuery(" 客户列表")
    CustomerPagePayload customers(Page page, String keyword);

    @GraphqlQuery(" 客户详情")
    CustomerPayload customer(Integer customerId);
    @GraphqlQuery(" 客户列表")
    List<CustomerPayload> listCustomer(CustomerListInput customerListInput);
    @GraphqlQuery("")
    List<CustomerPayload> allListCustomer();
    @GraphqlQuery(" 客户分组列表")
    List<CustomerGroupPayload> customerGroups();
    @GraphqlQuery("")
    CustomerPayload orgCustomer();
    @GraphqlMutation(" 创建客户")
    Integer createCustomer(CustomerInput customerInput);
    @GraphqlMutation(" 更新客户")
    Integer updateCustomer(CustomerInput customerInput);
    @GraphqlMutation(" 删除客户")
    Integer deleteCustomer(Integer customerId);
    @GraphqlMutation(" 创建客户地址")
    Integer createCustomerDistribution(CustomerDistributionInput customerDistributionInput);
    @GraphqlMutation(" 更新客户地址")
    Integer updateCustomerDistribution(CustomerDistributionInput customerDistributionInput);
    @GraphqlMutation(" 删除客户地址")
    Integer deleteCustomerDistribution(Integer distributionId);
}