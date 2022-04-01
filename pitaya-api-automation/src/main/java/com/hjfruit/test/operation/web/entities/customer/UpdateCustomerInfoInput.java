package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

/**
 * 更新(个人）客户请求体
 */
@Data
public class UpdateCustomerInfoInput {
    /**
     * 客户id
     */
    private Integer id;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 客户姓名
     */
    private String name;
    /**
     * 客户身份证
     */
    private String idNumber;
}