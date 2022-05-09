package com.hjfruit.test.pitaya.app.entities.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommoditySku {
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private String commoditySkuName;
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private List<Integer> commoditySpecOptionId;
    /**
     *
     */
    private List<String> commoditySpecOptionName;
    /**
     *
     */
    private BigDecimal conversion;
}