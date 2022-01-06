package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

/**
 *
 */
@Data
public class PitayaListCommodityPayLoad {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 品类id
     */
    private Integer categoryId;
    /**
     * 品类名称
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
    private Integer originId;
    /**
     * 产地名称
     */
    private String originName;
    /**
     * sku数量
     */
    private Integer skuQuantity;
    /**
     * 状态
     */
    private Integer status;
}