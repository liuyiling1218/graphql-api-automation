package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产计划状态下拉（待审核：10 、进行中：20或30 已完成：40）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionPlanStatus {
    /**
     * 待审核数量
     */
    private Integer pendingReviewNum;
    /**
     * 进行中数量
     */
    private Integer processingNum;
    /**
     * 已完成数量
     */
    private Integer completedNum;
}