package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PitayaBomPayload {
    /**
     * bom id
     */
    private Integer commodityBomId;
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品类型
     */
    private String commodityTypeName;
    /**
     * 商品分类
     */
    private String commodityCategoryName;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品规格选项
     */
    private List<String> commoditySpecOptionName;
}