package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;
/**
 * 
 */
@Data
public class OverviewStatusPayload{
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