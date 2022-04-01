package com.hjfruit.test.pitaya.app.entities.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OverviewStatusPayload {
    /**
     * 待审核数量
     */
    private Integer pendingReviewNum;
    /**
     * 生产中数量
     */
    private Integer processingNum;
    /**
     * 已完成数量
     */
    private Integer completedNum;
}