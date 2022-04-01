package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

import java.util.List;

/**
 * 客户返回实体
 */
@Data
public class CustomerVO {
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
     * 创建时间
     */
    private Long createTime;
    /**
     * 配送信息
     */
    private List<CustomerDistributionVO> customerDistribution;
}