package com.hjfruit.test.pitaya.app.entities.plan;

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