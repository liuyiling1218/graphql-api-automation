package com.hjfruit.test.pitaya.entities.base.customer;

import lombok.Data;

/**
 *
 */
@Data
public class CustomerDistributionPayload {
    /**
     * 配送ID
     */
    private Integer distributionId;
    /**
     * 客户ID
     */
    private Integer customerId;
    /**
     * 配送名称
     */
    private String distributionName;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系电话
     */
    private String phoneNum;
    /**
     * 配送地址
     */
    private String distributionAddr;
}