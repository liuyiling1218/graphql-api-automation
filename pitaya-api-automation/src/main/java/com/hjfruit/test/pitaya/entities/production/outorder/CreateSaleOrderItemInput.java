package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CreateSaleOrderItemInput {
    /**
     * 商品skuID
     */
    private Integer commoditySkuId;
    /**
     * 最大销量
     */
    private Integer maxQuantity;
    /**
     * 计划生产
     */
    private Integer planQuantity;
    /**
     * 销售单价
     */
    private BigDecimal salePrice;
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
    private List<String> packageIds;
    /**
     *
     */
    private List<OutOrderItemRequestInput> packageRequireInfos;
    /**
     * 品质要求
     */
    private String quantityLabel;
}