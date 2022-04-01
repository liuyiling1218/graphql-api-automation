package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageCustomer {
    /**
     * 应用id
     */
    private Integer appId;
    /**
     * 客户id
     */
    private Integer customerId;
    /**
     * 客户类型
     */
    private Integer customerType;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 联系人信息
     */
    private List<LinkmanInfo> linkmanInfo;
    /**
     * 纳税人识别号
     */
    private String identifyNumber;
    /**
     * 创建时间
     */
    private Long createTime;
}