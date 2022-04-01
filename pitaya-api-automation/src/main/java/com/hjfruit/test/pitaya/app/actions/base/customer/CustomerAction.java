package com.hjfruit.test.pitaya.app.actions.base.customer;

import com.hjfruit.test.pitaya.app.apis.base.customer.CutomerApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerAction {
    @Autowired
    CutomerApi cutomerApi;

    /**
     * 客户列表
     *
     * @param page
     * @param keyword
     * @return
     */
    public CustomerPagePayload customers(Page page, String keyword) {
        return cutomerApi.customers(page, keyword);
    }

    /**
     * 客户详情
     *
     * @param customerId
     * @return
     */
    public CustomerPayload customer(Integer customerId) {
        return cutomerApi.customer(customerId);
    }

    /**
     * 客户列表
     *
     * @param customerListInput
     * @return
     */
    public List<CustomerPayload> listCustomer(CustomerListInput customerListInput) {
        return cutomerApi.listCustomer(customerListInput);
    }

    /**
     * "
     *
     * @return
     */
    public List<CustomerPayload> allListCustomer() {
        return cutomerApi.allListCustomer();

    }

    /**
     * 客户分组列表
     *
     * @return
     */
    public List<CustomerGroupPayload> customerGroups() {
        return cutomerApi.customerGroups();
    }

    /**
     * "
     *
     * @return
     */
    public CustomerPayload orgCustomer() {
        return cutomerApi.orgCustomer();

    }

    /**
     * 创建客户
     *
     * @param customerInput
     * @return
     */
    public Integer createCustomer(CustomerInput customerInput) {
        Integer customerId = cutomerApi.createCustomer(customerInput);
        return customerId;
    }

    /**
     * 更新客户
     *
     * @param customerInput
     * @return
     */
    public Integer updateCustomer(CustomerInput customerInput) {
        Integer customerId = cutomerApi.updateCustomer(customerInput);
        return customerId;

    }

    /**
     * 删除客户
     *
     * @param customerId
     * @return
     */
    public Integer deleteCustomer(Integer customerId) {
        Integer customer = cutomerApi.deleteCustomer(customerId);

        return customer;
    }

    /**
     * 创建客户地址
     *
     * @param customerDistributionInput
     * @return
     */
    public Integer createCustomerDistribution(CustomerDistributionInput customerDistributionInput) {
        Integer customerDistributionId = cutomerApi.createCustomerDistribution(customerDistributionInput);
        return customerDistributionId;
    }

    /**
     * 更新客户地址
     *
     * @param customerDistributionInput
     * @return
     */
    public Integer updateCustomerDistribution(CustomerDistributionInput customerDistributionInput) {
        Integer customerDistributionId = cutomerApi.updateCustomerDistribution(customerDistributionInput);
        return customerDistributionId;
    }

    /**
     * 删除客户地址
     *
     * @param distributionId
     * @return
     */
    public Integer deleteCustomerDistribution(Integer distributionId) {
        Integer customerDistributionId = cutomerApi.deleteCustomerDistribution(distributionId);
        return customerDistributionId;
    }
}
