package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 任务实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskPayload {
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 生产组长id
     */
    private Integer leaderId;
    /**
     * 生产组长名称
     */
    private String leaderName;
    /**
     * 任务状态ID
     */
    private Integer taskStatus;
    /**
     * 任务状态名称
     */
    private String taskStatusName;
    /**
     * 任务单号名称
     */
    private String taskCode;
    /**
     * 生产线
     */
    private Integer line;
    /**
     * 计划人数
     */
    private Integer numberPlan;
    /**
     * 商品信息
     */
    private List<TaskItemPayload> commodities;
}