package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产操作记录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskLog {
    /**
     * 生产任务操作日志id
     */
    private Integer taskLogId;
    /**
     * 生产计划id
     */
    private String planId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 生产任务操作日志类型【10：开始任务、20：原料领料、30：辅料领料、40：成品入库、50：结束任务】
     */
    private Integer taskLogType;
    /**
     * 生产任务操作类型枚举文字
     */
    private String taskLogTypeText;
    /**
     * 生产任务操作日志备注
     */
    private String taskLogDescription;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人id
     */
    private Integer createBy;
    /**
     * 创建人名称
     */
    private String createUserName;
}