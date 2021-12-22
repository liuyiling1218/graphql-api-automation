package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 库存
 */
@Data
public class Stock {
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品sku id
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
     * 客户id
     */
    private Integer customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 客户分组id
     */
    private Integer customerGroupId;
    /**
     * 客户分组名称
     */
    private String customerGroupName;
    /**
     * 单位类型数量
     */
    private BigDecimal stockUnitQuantity;
    /**
     * 单位类型
     */
    private Integer stockUnitType;
    /**
     * 单位类型名称
     */
    private String stockUnitTypeName;
    /**
     * 总计类型数量
     */
    private BigDecimal stockTotalQuantity;
    /**
     * 总计类型
     */
    private Integer stockTotalType;
    /**
     * 总计类型名称
     */
    private String stockTotalTypeName;
}