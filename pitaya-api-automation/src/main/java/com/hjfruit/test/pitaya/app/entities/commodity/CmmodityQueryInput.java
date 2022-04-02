package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmmodityQueryInput {
    /**
     * 商品类型 果品辅料周转筐
     */
    private Integer commodityTypeId;
    /**
     * 分类id
     */
    private Integer categoryId;
    /**
     * 品种id
     */
    private Integer varietyId;
    /**
     * 产地id
     */
    private Integer placeOriginId;
    /**
     * sku的类型 原料 成品 半成品 次品
     */
    private Integer skuType;
    /**
     * 商品名称模糊查询
     */
    private String commodityName;
}