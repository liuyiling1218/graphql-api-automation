package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 生产计划中任务入参
 */
@Data
public class InsertPlanTaskInput {
    /**
     * 商品信息
     */
    @Needed
    private List<CommodityInput> commodities;
}