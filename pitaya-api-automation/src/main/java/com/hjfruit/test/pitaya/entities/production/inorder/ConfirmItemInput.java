package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class ConfirmItemInput {
    /**
     * item列表Id
     */
    private String inOrderItemId;
    /**
     * SPUId
     */
    @Needed
    private Integer commodityId;
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
     * 总价
     */
    private BigDecimal totalPrice;
}