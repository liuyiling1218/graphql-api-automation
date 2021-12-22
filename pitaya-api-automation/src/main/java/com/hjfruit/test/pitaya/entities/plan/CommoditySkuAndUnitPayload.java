package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CommoditySkuAndUnitPayload {
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private List<Integer> commoditySpecOptionId;
    /**
     *
     */
    private List<String> skuTextDescription;
    /**
     *
     */
    private BigDecimal unitQuantity;
    /**
     *
     */
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     *
     */
    private Integer totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     *
     */
    private Integer commodityBomId;
}