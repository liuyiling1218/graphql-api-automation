package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class SubsidiaryDetailInput {
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
    private String commodityCategoryName;
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private Integer skuSum;
    /**
     *
     */
    private CommoditySpecInput commoditySpec;
}