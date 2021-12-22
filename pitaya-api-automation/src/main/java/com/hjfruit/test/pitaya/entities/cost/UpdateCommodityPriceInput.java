package com.hjfruit.test.pitaya.entities.cost;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class UpdateCommodityPriceInput {
    /**
     * 商品skuid
     */
    @Needed
    private Integer skuId;
    /**
     * 单价
     */
    @Needed
    private BigDecimal actualPrice;
    /**
     * 小计总价
     */
    @Needed
    private BigDecimal actualTotalPrice;
}