package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 生产任务列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tasks {
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 任务状态【10：无状态、20：待生产、30：生产中、40：已完成、50：已取消】
     */
    private Integer taskStatus;
    /**
     * 任务状态名称
     */
    private String taskStatusName;
    /**
     * 任务单号
     */
    private String taskCode;
    /**
     * 开始时间
     */
    private Long startTime;
    /**
     * 结束时间
     */
    private Long endTime;
    /**
     * 生产进度
     */
    private String schedule;
    /**
     * 总预期数量
     */
    private Integer totalExpectNum;
    /**
     * 总实际生产数量
     */
    private Integer totalCompletedNum;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 任务明细
     */
    private List<TaskItems> taskItems;
}