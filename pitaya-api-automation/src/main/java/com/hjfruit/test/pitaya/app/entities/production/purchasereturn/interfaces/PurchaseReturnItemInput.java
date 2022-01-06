package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 采购退货订单商品信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseReturnItemInput {
    /**
     * skuId
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 退货数量副单位
     */
    private BigDecimal totalQuantity;
    /**
     * 退货数量基本单位
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     * 金额小计 ？
     */
    private BigDecimal totalAmount;
}