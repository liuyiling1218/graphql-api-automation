package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PlanTaskInput {
    /**
     *
     */
    @Needed
    private String planId;
    /**
     * 计划任务信息
     */
    @Needed
    private List<TaskInput> task;
}