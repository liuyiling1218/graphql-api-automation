package com.hjfruit.test.pitaya.app.helper.base;

import com.hjfruit.test.pitaya.app.apis.base.customer.CutomerApi;
import com.hjfruit.test.pitaya.app.entities.base.customer.CustomerPayload;
import com.hjfruit.test.pitaya.app.model.base.CustomerModel;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerHelper {
    @Autowired
    CutomerApi cutomerApi;

    public CustomerModel getCustomer(PitayaConstants.CustomerType customerType) {
        CustomerModel customerModel = new CustomerModel();
        customerModel.setBelongType(customerType.getCustomerTypeId());
        if (customerType == PitayaConstants.CustomerType.NO_CUSTOMER) {
            CustomerPayload customerPayload = cutomerApi.orgCustomer();
            customerModel.setBelongId(customerPayload.getCustomerId());
        } else {
            List<CustomerPayload> customerPayloads = cutomerApi.allListCustomer();
            if (customerType == PitayaConstants.CustomerType.CUSTOMER_GROUP) {
                customerModel.setBelongId(customerPayloads.get(0).getCustomerGroupId());
            } else if (customerType == PitayaConstants.CustomerType.DESIGNATED_CUSTOMER) {
                customerModel.setBelongId(customerPayloads.get(0).getCustomerId());
            }
        }
        return customerModel;
    }

    public CustomerModel switchCustomer(PitayaConstants.CustomerType customerType) {
        CustomerModel customerModel = new CustomerModel();
        cutomerApi.deleteCustomer(787);

        return customerModel;
    }
}