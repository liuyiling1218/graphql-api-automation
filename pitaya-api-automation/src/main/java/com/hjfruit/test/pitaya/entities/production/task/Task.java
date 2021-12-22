package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

import java.util.List;

/**
 * 生产任务详情
 */
@Data
public class Task {
    /**
     * 生产计划id
     */
    private String planId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 任务单号
     */
    private String taskCode;
    /**
     * 任务状态【10：无状态，计划未发布时任务没有状态、20：待生产、30：生产中、40：已完成、50：已取消】
     */
    private Integer taskStatus;
    /**
     * 任务状态名称
     */
    private String taskStatusName;
    /**
     * 生产组长id
     */
    private Integer leaderId;
    /**
     * 生产组长名称
     */
    private String leaderName;
    /**
     * 生产线
     */
    private Integer line;
    /**
     * 计划人数
     */
    private Integer numberPlan;
    /**
     * 正式工人数
     */
    private Integer numberActual;
    /**
     * 临时工人数
     */
    private Integer tempWorkerQuantity;
    /**
     * 取消原因
     */
    private String cancelReason;
    /**
     * 生产计划
     */
    private Plan plan;
    /**
     * 生产任务明细
     */
    private List<TaskItem> taskItems;
}