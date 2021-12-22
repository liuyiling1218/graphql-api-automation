package com.hjfruit.test.pitaya.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageDamagedOrderInput {
    /**
     * 任务id
     */
    @Needed
    private String taskId;
    /**
     * 出库类型
     */
    @Needed
    private List<Integer> outOrderType;
    /**
     * 出库订单状态
     */
    private Integer outOrderStatus;
}