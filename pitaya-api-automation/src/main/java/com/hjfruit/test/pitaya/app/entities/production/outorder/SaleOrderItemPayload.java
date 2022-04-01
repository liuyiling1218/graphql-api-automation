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
public class SaleOrderItemPayload {
    /**
     *
     */
    private String outOrderItemId;
    /**
     * SPUId
     */
    private Integer commodityId;
    /**
     * SPU名称
     */
    private String commodityName;
    /**
     * 商品skuID
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项Id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * 规格选项
     */
    private List<String> skuTextDescription;
    /**
     * 最大销量
     */
    private String maxQuantity;
    /**
     * 预估销量
     */
    private String planQuantity;
    /**
     * 实际销量 v1.6
     */
    private BigDecimal realQuantity;
    /**
     * 副单位类型名称
     */
    private String totalTypeName;
    /**
     * 销售单价
     */
    private String salePrice;
    /**
     * 规格要求
     */
    private String specificationLabel;
    /**
     * 包装要求
     */
    private String packageLabel;
    /**
     *
     */
    private List<OutOrderItemRequestPayload> packageRequireInfos;
    /**
     * 品质要求
     */
    private String quantityLabel;
    /**
     * 品类Id
     */
    private Integer categoryId;
}