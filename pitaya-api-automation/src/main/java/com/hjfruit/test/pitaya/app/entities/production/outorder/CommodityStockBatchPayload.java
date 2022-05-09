package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
public class CommodityStockBatchPayload {
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
    private String commodityName;
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * sku文字描述，规格选项文字数组
     */
    private List<String> skuTextDescription;
    /**
     *
     */
    private Integer customerType;
    /**
     *
     */
    private String customerTypeName;
    /**
     *
     */
    private Integer customerId;
    /**
     *
     */
    private String customerName;
    /**
     *
     */
    private BigDecimal stockUnitQuantity;
    /**
     *
     */
    private Integer stockUnitType;
    /**
     *
     */
    private String stockUnitTypeName;
    /**
     *
     */
    private BigDecimal stockTotalQuantity;
    /**
     *
     */
    private Integer stockTotalType;
    /**
     *
     */
    private String stockTotalTypeName;
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
     * 换算单位
     */
    private BigDecimal conversion;
    /**
     *
     */
    private BigDecimal pickingUnitQuantity;
    /**
     *
     */
    private BigDecimal pickingTotalQuantity;
}