package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产任务列表查询
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskCondition {
    /**
     * 时间 yyyy-MM-dd
     */
    @Needed
    private Long date;
    /**
     * 任务状态
     */
    @Needed
    private Integer taskStatus;
}