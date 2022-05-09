package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 创建生产计划信息入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanInfoInput {
    /**
     * 商品类型
     */
    @Needed
    private Integer commodityType;
    /**
     * 客户类型
     */
    private Integer customerType;
    /**
     * 客户id
     */
    @Needed
    private Integer customerId;
    /**
     * 仓库id
     */
    @Needed
    private String warehouseId;
    /**
     * 生产开始日期
     */
    @Needed
    private Long planStartTime;
    /**
     * 生产结束日期
     */
    @Needed
    private Long planEndTime;
    /**
     * 备注
     */
    private String planDescription;
    /**
     * 客户配送地址
     */
    private Integer customerDistributionId;
    /**
     * 计划任务信息
     */
    @Needed
    private List<TaskInsertInput> task;
}