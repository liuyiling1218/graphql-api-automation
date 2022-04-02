package com.hjfruit.test.pitaya.app.entities.production.task;

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
    private Long date;
    /**
     * 任务状态
     */
    private Integer taskStatus;
}