package com.hjfruit.test.pitaya.app.entities.secondment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String batchId;
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