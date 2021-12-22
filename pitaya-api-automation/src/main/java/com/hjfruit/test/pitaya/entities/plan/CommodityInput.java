package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品入参
 */
@Data
public class CommodityInput {
    /**
     * 任务明细id
     */
    private String taskItemId;
    /**
     * 商品sku id
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 期望数量
     */
    @Needed
    private BigDecimal expectNum;
}