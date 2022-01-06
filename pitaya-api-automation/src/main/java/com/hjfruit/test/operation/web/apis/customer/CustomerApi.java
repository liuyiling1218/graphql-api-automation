package com.hjfruit.test.operation.web.apis.customer;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.customer.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface CustomerApi {
    @GraphqlQuery(" 客户列表")
    CustomerPageResult customers(Page page, String keyword);

    @GraphqlQuery(" 客户详情")
    CustomerVO customer(Integer customerId);

    @GraphqlQuery(" 客户分组列表")
    List<CustomerGroupResponse> customerGroups();

    @GraphqlQuery(" 客户分页列表【运营平台】")
    PageCustomerPayload pageCustomer(PageCustomerInput pageCustomerInput, Page page);

    @GraphqlMutation(" 创建客户")
    Integer createCustomer(CustomerInput customerInput);

    @GraphqlMutation(" 更新客户")
    Integer updateCustomer(CustomerInput customerInput);

    @GraphqlMutation(" 删除客户")
    Boolean deleteCustomer(Integer customerId);

    @GraphqlMutation(" 创建客户地址")
    Integer createCustomerDistribution(CustomerDistributionInput customerDistributionInput);

    @GraphqlMutation(" 更新客户地址")
    Integer updateCustomerDistribution(CustomerDistributionInput customerDistributionInput);

    @GraphqlMutation(" 删除客户地址")
    Boolean deleteCustomerDistribution(Integer distributionId);

    @GraphqlMutation(" 更新（个人）客户信息")
    Integer updateCustomerInfo(UpdateCustomerInfoInput updateCustomerInput);

    @GraphqlMutation(" 更新客户名称拼音")
    Integer updatePinyinOfCustomerName(UpdatePinyinInput updatePinyinInput);
}