package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class PurchaseOrderItemInsertInput {
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
    @Needed
    private BigDecimal unitPrice;
    /**
     * 单价单位类型
     */
    @Needed
    private Integer unitPriceType;
    /**
     * 总价
     */
    @Needed
    private BigDecimal totalPrice;
}