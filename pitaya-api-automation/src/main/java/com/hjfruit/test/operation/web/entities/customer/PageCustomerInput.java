package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

/**
 *
 */
@Data
public class PageCustomerInput {
    /**
     * 所属客户
     */
    private Integer appId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 手机号
     */
    private String phone;
}