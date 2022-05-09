package com.hjfruit.test.pitaya.app.entities.convert.type;

import com.hjfruit.test.pitaya.app.entities.common.CommoditySku;
import com.hjfruit.test.pitaya.app.entities.common.Unit;
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
public class CommodityConvertItemPayload {
    /**
     *
     */
    @Needed
    private String itemId;
    /**
     *
     */
    @Needed
    private String batchId;
    /**
     *
     */
    private BigDecimal stockUnitQuantity;
    /**
     *
     */
    private BigDecimal stockTotalQuantity;
    /**
     *
     */
    @Needed
    private String batchCode;
    /**
     *
     */
    private CommoditySku commodityDetail;
    /**
     *
     */
    private Unit unitType;
    /**
     *
     */
    private Unit totalType;
    /**
     *
     */
    private Unit priceType;
    /**
     *
     */
    private BigDecimal unitQuantity;
    /**
     *
     */
    private BigDecimal totalQuantity;
}