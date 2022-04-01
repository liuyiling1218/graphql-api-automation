package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 配料列表
 */
@Data
public class PitayaBomDetailPayload {
    /**
     * 配料id
     */
    private Integer commodityBomDetailId;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 商品分类id
     */
    private Integer commodityCategoryId;
    /**
     * 商品分类名称
     */
    private String commodityCategoryName;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项名称
     */
    private List<String> commoditySpecOptionName;
    /**
     * 数量
     */
    private BigDecimal quantity;
    /**
     * 数量单位
     */
    private Integer quantityUnit;
    /**
     * 数量单位名称
     */
    private String quantityUnitName;
}