package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class CommoditySkuStockPayload {
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private BigDecimal stockUnitQuantity;
    /**
     *
     */
    private BigDecimal stockTotalQuantity;
}