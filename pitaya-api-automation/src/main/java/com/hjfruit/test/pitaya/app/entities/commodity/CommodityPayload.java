package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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