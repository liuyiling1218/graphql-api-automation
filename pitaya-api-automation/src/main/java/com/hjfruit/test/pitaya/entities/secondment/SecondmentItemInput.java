package com.hjfruit.test.pitaya.entities.secondment;

import lombok.Data;

/**
 *
 */
@Data
public class SecondmentItemInput {
    /**
     *
     */
    private String secondmentItemId;
    /**
     *
     */
    private String secondmentId;
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
    private Integer skuId;
    /**
     *
     */
    private Integer batchId;
    /**
     * specOptionId :IntskuTextDescription:String
     */
    private Float transferTotalQuantity;
    /**
     *
     */
    private Float transferUnitQuantity;
    /**
     * unitType :IntunitTypeName:StringtotalType :InttotalTypeName :String
     */
    private Float transferPrice;
}