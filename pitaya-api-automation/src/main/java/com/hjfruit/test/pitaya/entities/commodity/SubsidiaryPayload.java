package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class SubsidiaryPayload {
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
    private Integer commodityCategoryId;
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
}