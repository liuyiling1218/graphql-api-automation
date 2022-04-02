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
public class SaleReturnItemPayload {
    /**
     * skuId
     */
    @Needed
    private Integer skuId;
    /**
     * 退货数量副单位
     */
    @Needed
    private BigDecimal returnTotalQuantity;
    /**
     * 退货数量基本单位
     */
    @Needed
    private BigDecimal returnUnitQuantity;
}