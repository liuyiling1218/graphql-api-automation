package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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