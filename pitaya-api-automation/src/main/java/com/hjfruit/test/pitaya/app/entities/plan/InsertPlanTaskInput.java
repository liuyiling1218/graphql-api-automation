package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 生产计划中任务入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertPlanTaskInput {
    /**
     * 商品信息
     */
    @Needed
    private List<CommodityInput> commodities;
}