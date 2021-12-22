package com.hjfruit.test.pitaya.entities.base.customer;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CustomerInput {
    /**
     * 客户ID
     */
    private Integer customerId;
    /**
     * 客户分组ID
     */
    private Integer customerGroupId;
    /**
     * 客户分组名称
     */
    private String customerGroupName;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 客户简称
     */
    private String customerShortName;
    /**
     * 备注信息
     */
    private String remark;
    /**
     *
     */
    private List<CustomerDistributionInput> customerDistributions;
}