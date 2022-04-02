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