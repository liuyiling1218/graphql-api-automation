package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 待入库商品信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToBeInboundPayload {
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     * SPU名称
     */
    private String commodityName;
    /**
     * 规格选项
     */
    private List<String> skuTextDescription;
    /**
     * 小单位数量
     */
    private BigDecimal unitQuantity;
    /**
     *
     */
    private Integer unitType;
    /**
     * 小单位类型名称
     */
    private String unitTypeName;
    /**
     * 副单位数量
     */
    private BigDecimal totalQuantity;
    /**
     *
     */
    private Integer totalType;
    /**
     * 副单位类型名称
     */
    private String totalTypeName;
    /**
     * 副单位与基本单位换算
     */
    private BigDecimal conversion;
    /**
     * 毛重
     */
    private BigDecimal grossUnitQuantity;
    /**
     * 待入库数量
     */
    private BigDecimal waitUnitQuantity;
    /**
     *
     */
    private BigDecimal waitTotalQuantity;
    /**
     *
     */
    private Integer pricePosition;
}