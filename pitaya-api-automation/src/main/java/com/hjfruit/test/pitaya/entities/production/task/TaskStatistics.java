package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 * 生产任务统计
 */
@Data
public class TaskStatistics {
    /**
     * 待生产数量
     */
    private Integer toBeProduced;
    /**
     * 生产中数量
     */
    private Integer inProduction;
    /**
     * 已完成数量
     */
    private Integer completed;
}