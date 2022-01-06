package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PitayaSkuDetailPayload {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项名称
     */
    private List<String> commoditySpecOptionName;
    /**
     * 商品单位id
     */
    private Integer unitId;
    /**
     * 商品单位名称
     */
    private String unitName;
    /**
     * 商品分类id
     */
    private Integer categoryId;
    /**
     * 商品分类名称
     */
    private String categoryName;
    /**
     * 品种id
     */
    private Integer varietyId;
    /**
     * 品种名称
     */
    private String varietyName;
    /**
     * 产地id
     */
    private Integer placeOriginId;
    /**
     * 产地名称
     */
    private String placeOriginName;
}