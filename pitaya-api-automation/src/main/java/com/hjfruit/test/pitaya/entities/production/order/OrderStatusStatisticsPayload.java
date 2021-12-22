package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

/**
 *
 */
@Data
public class OrderStatusStatisticsPayload {
    /**
     * 待提交数量
     */
    private Integer toSubmitNum;
    /**
     * 进行中数量
     */
    private Integer processingNum;
    /**
     * 已完成数量
     */
    private Integer completedNum;
}