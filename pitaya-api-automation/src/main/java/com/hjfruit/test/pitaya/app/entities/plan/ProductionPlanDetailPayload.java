package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 生产计划详情
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionPlanDetailPayload {
    /**
     * 计划id
     */
    private String planId;
    /**
     * 订单号
     */
    private String planCode;
    /**
     * 销售单号
     */
    private String outOrderId;
    /**
     * 任务状态ID
     */
    private Integer planStatus;
    /**
     * 任务状态名称
     */
    private String planStatusName;
    /**
     * 客户所属id
     */
    private Integer customerId;
    /**
     * 客户所属名称
     */
    private String customerName;
    /**
     * 客户配送地址id
     */
    private Integer customerDistributionId;
    /**
     * 客户配送地址名称
     */
    private String customerDistributionName;
    /**
     * 仓库id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 生产日期
     */
    private Long planDate;
    /**
     * 计划开始时间
     */
    private Long planStartTime;
    /**
     * 计划结束时间
     */
    private Long planEndTime;
    /**
     * 备注
     */
    private String planDescription;
    /**
     * 生产计划日志备注
     */
    private String planLogDescription;
    /**
     * 成品销售创建计划:10 手动创建计划:20
     */
    private Integer createType;
    /**
     * 创建类型名称
     */
    private String createTypeName;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
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
    private String createUserName;
    /**
     * 计划任务信息
     */
    private List<TaskPayload> task;
}