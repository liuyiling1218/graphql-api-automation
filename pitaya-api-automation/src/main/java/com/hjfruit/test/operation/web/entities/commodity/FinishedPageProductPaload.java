package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class FinishedPageProductPaload {
    /**
     * 商品skuId
     */
    private Integer commoditySkuId;
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
     * 商品规格
     */
    private List<String> specText;
    /**
     * 商品分类id
     */
    private Integer commodityCategoryId;
    /**
     * 商品分类名称
     */
    private String commodityCategoryName;
    /**
     * 商品品种
     */
    private String varietyName;
    /**
     * 商品产地
     */
    private String placeOriginName;
}