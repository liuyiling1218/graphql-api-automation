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
    /**
     * 批次id
     */
    private String batchId;
    /**
     * 小单位类型
     */
    private Integer unitType;
}