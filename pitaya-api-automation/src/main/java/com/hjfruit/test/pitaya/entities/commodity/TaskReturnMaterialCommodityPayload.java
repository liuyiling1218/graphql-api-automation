package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class TaskReturnMaterialCommodityPayload {
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
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private Integer status;
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
    private BigDecimal totalQuantity;
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
    private List<Integer> property;
    /**
     *
     */
    private Integer bomId;
    /**
     *
     */
    private Integer createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private Integer updateTime;
    /**
     *
     */
    private Integer updateBy;
    /**
     *
     */
    private Integer Deleted;
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
    private String customerName;
    /**
     *
     */
    private Integer customerId;
    /**
     *
     */
    private String stockBatchCode;
    /**
     *
     */
    private Integer stockBatchId;
    /**
     *
     */
    private String outStockRecordItemId;
    /**
     *
     */
    private String outStockRecordId;
    /**
     *
     */
    private BigDecimal pickingUnitQuantity;
    /**
     *
     */
    private BigDecimal pickingTotalQuantity;
}