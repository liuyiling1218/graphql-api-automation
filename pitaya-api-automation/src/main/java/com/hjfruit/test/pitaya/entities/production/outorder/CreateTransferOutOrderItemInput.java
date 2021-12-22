package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class CreateTransferOutOrderItemInput {
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