package com.hjfruit.test.pitaya.app.entities.production.order;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderStatusStatisticsInput {
    /**
     * 生产任务id
     */
    @Needed
    private String taskId;
    /**
     * 任务类型id
     */
    @Needed
    private Integer taskTypeCode;
    /**
     * 出库类型
     */
    private Integer orderType;
}