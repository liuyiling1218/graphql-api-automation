package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanTaskInfoInput {
    /**
     * 变更id
     */
    private String changeId;
    /**
     * 生产任务id
     */
    @Needed
    private String taskId;
    /**
     * 生产计划id
     */
    @Needed
    private String planId;
    /**
     * 生产组长id
     */
    @Needed
    private Integer leaderId;
    /**
     * 生产组长名称
     */
    @Needed
    private String leaderName;
    /**
     * 生产线
     */
    @Needed
    private Integer line;
    /**
     * 商品信息
     */
    @Needed
    private List<CommodityInput> commodities;
}