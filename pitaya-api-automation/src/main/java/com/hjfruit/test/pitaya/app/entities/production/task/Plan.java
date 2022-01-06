package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产计划
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plan {
    /**
     * 计划id
     */
    private String planId;
    /**
     * 计划单号
     */
    private String planCode;
    /**
     * 计划状态【10：待发布、20：待生产、30：生产中、40：已完成、50：已取消】
     */
    private Integer planStatus;
    /**
     * 客户类型
     */
    private Integer customerType;
    /**
     * 客户id
     */
    private Integer customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 配送地址id
     */
    private Integer customerDistributionId;
    /**
     * 配送地址名称
     */
    private String customerDistributionName;
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 生产日期
     */
    private Long planDate;
    /**
     * 计划开始时间
     */
    private Long planStartTime;
    /**
     * 计划结束时间
     */
    private Long planEndTime;
    /**
     * 备注
     */
    private String planDescription;
    /**
     * 计划类型
     */
    private Integer createType;
}