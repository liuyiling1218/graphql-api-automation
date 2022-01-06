package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOrDeleteRecords {
    /**
     * 任务明细变更id
     */
    private String taskItemChangeId;
    /**
     * 计划id
     */
    private String planId;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 任务明细id
     */
    private String taskItemId;
    /**
     * 变更前的数量
     */
    private BigDecimal beforeQuantity;
    /**
     * 变更后的数量
     */
    private BigDecimal afterQuantity;
    /**
     * 变更数量
     */
    private BigDecimal changeQuantity;
    /**
     * 变更类型 10：增加 20：减少
     */
    private Integer changeType;
    /**
     * 变更描述与备注
     */
    private String changeRemark;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 创建人名称
     */
    private String createByName;
}