package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产任务统计
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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