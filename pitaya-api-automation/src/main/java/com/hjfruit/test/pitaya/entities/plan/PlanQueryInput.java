package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

/**
 * 生产计划查询入参
 */
@Data
public class PlanQueryInput {
    /**
     * 模糊查询
     */
    private String param;
    /**
     * 列表头筛选日期
     */
    private Long planDate;
    /**
     * 状态
     */
    private Integer planStatus;
}