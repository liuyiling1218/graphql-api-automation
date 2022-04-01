package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 商品入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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