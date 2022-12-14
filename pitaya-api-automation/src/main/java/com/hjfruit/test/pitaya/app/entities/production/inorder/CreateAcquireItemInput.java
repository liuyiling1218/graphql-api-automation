package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class CreateAcquireItemInput {
    /**
     * 商品skuID
     */
    @Needed
    private Integer skuId;
    /**
     *
     */
    private Integer pricePosition;
    /**
     * 单价
     */
    @Needed
    private BigDecimal price;
    /**
     * 单价单位类型
     */
    @Needed
    private Integer priceType;
    /**
     * 单位数量
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     *
     */
    private Integer unitType;
    /**
     * 总计数量
     */
    private BigDecimal totalQuantity;
    /**
     *
     */
    private Integer totalType;
}