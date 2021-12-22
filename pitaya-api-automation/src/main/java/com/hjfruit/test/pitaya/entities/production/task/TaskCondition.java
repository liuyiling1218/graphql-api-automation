package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 * 生产任务列表查询
 */
@Data
public class TaskCondition {
    /**
     * 时间 yyyy-MM-dd
     */
    private Long date;
    /**
     * 任务状态
     */
    private Integer taskStatus;
}