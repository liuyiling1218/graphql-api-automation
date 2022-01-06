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
public class CreateOtherOrderItemInput {
    /**
     * 商品skuID
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 小单位数量
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     * 副单位数量
     */
    private BigDecimal totalQuantity;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单价单位类型
     */
    private Integer unitPriceType;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
}