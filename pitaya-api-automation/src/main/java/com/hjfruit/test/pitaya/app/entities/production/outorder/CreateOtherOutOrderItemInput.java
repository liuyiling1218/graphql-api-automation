package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
public class CreateOtherOutOrderItemInput {
    /**
     *
     */
    @Needed
    private Integer batchId;
    /**
     * 商品skuID
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 小单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 大单位数量
     */
    private BigDecimal totalQuantity;
}