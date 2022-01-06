package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 开始任务请求参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeginTask {
    /**
     * 任务id
     */
    @Needed
    private String taskId;
    /**
     * 正式工人数
     */
    @Needed
    private Integer numberActual;
    /**
     * 零时工人数
     */
    @Needed
    private Integer tempWorkerQuantity;
}