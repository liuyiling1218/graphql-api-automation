package com.hjfruit.test.pitaya.app.entities.stock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 出库记录聚合
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutStockRecordItemAggPayload {
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private List<String> skuTextDescription;
    /**
     *
     */
    private BigDecimal basketQuantity;
    /**
     *
     */
    private String basketCustomerName;
    /**
     *
     */
    private BigDecimal salePrice;
    /**
     *
     */
    private String salePriceTypeName;
    /**
     *
     */
    private BigDecimal totalPrice;
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
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     *
     */
    private List<OutStockRecordItemPayload> items;
    /**
     *
     */
    private String outStockCode;
    /**
     * 单位换算
     */
    private BigDecimal conversion;
}