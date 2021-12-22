package com.hjfruit.test.pitaya.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class DamagedOrderStatisticsInput {
    /**
     *
     */
    @Needed
    private String taskId;
    /**
     *
     */
    @Needed
    private List<Integer> outOrderType;
    /**
     *
     */
    private Integer outOrderStatus;
}