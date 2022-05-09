package com.hjfruit.test.pitaya.app.entities.secondment;

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
public class SecondmentItemPayload {
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