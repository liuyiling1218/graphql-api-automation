package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 采购退货订单商品信息
 */
@Data
public class PurchaseReturnItemInput {
    /**
     * skuId
     */
    @Needed
    private Integer skuId;
    /**
     * 退货数量副单位
     */
    private BigDecimal returnTotalQuantity;
    /**
     * 退货数量基本单位
     */
    @Needed
    private BigDecimal returnUnitQuantity;
}