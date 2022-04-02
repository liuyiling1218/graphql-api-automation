package com.hjfruit.test.pitaya.app.entities.stock;

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
public class OutStockRecordItemPayload {
    /**
     *
     */
    private Long outStockRecordItemId;
    /**
     *
     */
    private String outStockRecordId;
    /**
     *
     */
    private String outOrderId;
    /**
     *
     */
    private String stockBatchCode;
    /**
     *
     */
    private String outOrderCode;
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
    private Integer commoditySkuId;
    /**
     *
     */
    private List<Integer> skuSpecOptionId;
    /**
     *
     */
    private List<String> skuTextDescription;
    /**
     *
     */
    private BigDecimal salePrice;
    /**
     *
     */
    private Integer salePriceType;
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
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     *
     */
    private BigDecimal unitQuantity;
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
    private BigDecimal totalQuantity;
    /**
     *
     */
    private String taskId;
    /**
     *
     */
    private Integer outOrderType;
    /**
     *
     */
    private Integer belongCustomerId;
    /**
     *
     */
    private String belongCustomerName;
    /**
     *
     */
    private String belongWarehouseId;
    /**
     *
     */
    private String belongWarehouseName;
    /**
     *
     */
    private Integer basketQuantity;
    /**
     *
     */
    private Integer basketCustomerId;
    /**
     *
     */
    private String basketCustomerName;
    /**
     * 库存单价
     */
    private BigDecimal stockUnitPrice;
    /**
     * 库存单价的单位
     */
    private Integer stockUnitPriceType;
    /**
     * 库存单价名称
     */
    private String stockUnitPriceTypeName;
    /**
     * 单价小计
     */
    private BigDecimal stockTotalPrice;
}