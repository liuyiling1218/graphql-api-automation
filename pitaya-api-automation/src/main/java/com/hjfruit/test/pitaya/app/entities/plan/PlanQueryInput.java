package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产计划查询入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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