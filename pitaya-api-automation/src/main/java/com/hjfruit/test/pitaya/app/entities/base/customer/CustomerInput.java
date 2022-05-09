package com.hjfruit.test.pitaya.app.entities.base.customer;

import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @Needed
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
    @Needed
    @NotEmpty
    private List<CustomerDistributionInput> customerDistributions;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private String idNumber;
    /**
     *
     */
    @Needed
    private CustomerAttribute attribute;
    /**
     *
     */
    @Needed
    private CustomerType type;
    /**
     *
     */
    private Integer belongOrgId;
    /**
     *
     */
    private Integer customerUserId;
}