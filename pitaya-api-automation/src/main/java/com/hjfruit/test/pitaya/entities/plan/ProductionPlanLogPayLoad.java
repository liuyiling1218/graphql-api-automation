package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

/**
 * 生产计划操作日志
 */
@Data
public class ProductionPlanLogPayLoad {
    /**
     * 生产计划日志id
     */
    private String planLogId;
    /**
     * 生产计划id
     */
    private String planId;
    /**
     * 日志操作类型
     */
    private Integer planLogType;
    /**
     * 日志操作类型枚举文字
     */
    private String planLogTypeText;
    /**
     * 日志备注
     */
    private String planLogDescription;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人id
     */
    private Integer createBy;
    /**
     * 创建人名称
     */
    private String createUserName;
}