package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class CommodityPayload {
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
    private Integer commodityTypeId;
    /**
     *
     */
    private String commodityTypeName;
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
    private Integer commodityVarietyId;
    /**
     *
     */
    private String commodityVarietyName;
    /**
     *
     */
    private Integer commodityPlaceOriginId;
    /**
     *
     */
    private String commodityPlaceOriginName;
}