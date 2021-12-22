package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class SkuQueryInput {
    /**
     * 商品类型 果品辅料周转筐
     */
    private Integer commodityId;
    /**
     * sku的类型 原料 成品 半成品 次品
     */
    private Integer skuType;
    /**
     * 是否有bom表 1 是 99 不是
     */
    private Integer buildBom;
}