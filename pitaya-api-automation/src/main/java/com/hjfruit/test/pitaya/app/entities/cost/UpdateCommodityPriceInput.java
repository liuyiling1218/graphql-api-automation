package com.hjfruit.test.pitaya.app.entities.cost;

import fc.test.api.graphql.annotation.Needed;
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
public class UpdateCommodityPriceInput {
    /**
     * 货款明细ID
     */
    @Needed
    private String itemId;
    /**
     * 商品skuid
     */
    @Needed
    private Integer skuId;
    /**
     * 单价
     */
    @Needed
    private BigDecimal unitPrice;
    /**
     * 小计总价
     */
    @Needed
    private BigDecimal totalAmount;
}