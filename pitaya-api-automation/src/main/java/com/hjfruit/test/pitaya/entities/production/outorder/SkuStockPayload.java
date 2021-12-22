package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class SkuStockPayload {
    /**
     *
     */
    private Integer commoditySkuId;
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
    private Integer warehouseId;
    /**
     *
     */
    private String warehouseName;
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
    private Integer unitType;
    /**
     * 单位类型名称
     */
    private String unitTypeName;
    /**
     * 总计类型（例：件）
     */
    private Integer totalType;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 小单位库存数量
     */
    private BigDecimal stockUnitQuantity;
    /**
     * 大单位库存数量
     */
    private BigDecimal stockTotalQuantity;
}