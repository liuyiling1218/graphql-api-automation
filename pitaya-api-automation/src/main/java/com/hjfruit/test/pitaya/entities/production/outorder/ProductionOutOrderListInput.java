package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class ProductionOutOrderListInput {
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
    private Integer outOrderType;
    /**
     * 任务状态
     */
    private Integer outOrderStatus;
}