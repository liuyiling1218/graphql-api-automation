package com.hjfruit.test.pitaya.app.helper.base;

import com.hjfruit.test.pitaya.app.apis.base.customer.CutomerApi;
import com.hjfruit.test.pitaya.app.entities.base.customer.CustomerPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerHelper {
    @Autowired
    CutomerApi cutomerApi;

    /**
     * 获取所属客户
     *
     * @return
     */
    public List<CustomerPayload> allListCustomer() {
        return cutomerApi.allListCustomer();
    }

    /**
     * 获取第一个所属客户
     *
     * @return
     */
    public CustomerPayload allListCustomer_getFirstCustomer() {
        return allListCustomer().get(0);
    }

    /**
     * 获取 通用货品 客户
     *
     * @return
     */
    public CustomerPayload orgCustomer() {
        return cutomerApi.orgCustomer();
    }
}
