package com.hjfruit.test.pitaya.app.entities.plan;

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