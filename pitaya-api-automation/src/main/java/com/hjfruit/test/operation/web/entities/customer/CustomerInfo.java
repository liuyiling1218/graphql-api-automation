package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

/**
 * 客户分页返回值,这种语法生成的是个接口，无法使用union CustomerPageResult = CustomerPage | PageResult 客户信息
 */
@Data
public class CustomerInfo {
    /**
     * 客户id
     */
    private Integer id;
    /**
     * 所属系统
     */
    private Integer appId;
    /**
     * 客户类型
     */
    private Integer type;
    /**
     * 客户名称
     */
    private String name;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人身份证号码
     */
    private String contactIdNumber;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 纳税人识别号
     */
    private String taxpayerIdentificationNumber;
    /**
     * 创建时间
     */
    private Long createTime;
}