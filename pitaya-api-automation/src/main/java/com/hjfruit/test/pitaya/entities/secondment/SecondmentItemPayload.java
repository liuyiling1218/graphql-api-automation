package com.hjfruit.test.pitaya.entities.secondment;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
/**
 * 
 */
@Data
public class SecondmentItemPayload{
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
     * 
     */
    private String batchCode;
    /**
     * 
     */
    private List<Integer> specOptionId;
    /**
     * 
     */
    private List<String> skuTextDescription;
    /**
     * 
     */
    private List<Integer> specOptionIdList;
    /**
     * 
     */
    private List<String> skuTextDescriptionList;
    /**
     * 
     */
    private Float totalQuantity;
    /**
     * 
     */
    private Float unitQuantity;
    /**
     * 
     */
    private Float transferTotalQuantity;
    /**
     * 
     */
    private Float transferUnitQuantity;
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
    private Float unitPrice;
    /**
     * 
     */
    private Float transferPrice;
    /**
     * 
     */
    private Integer priceType;
    /**
     * 
     */
    private String priceTypeName;
    /**
     * 
     */
    private BigDecimal conversion;
}