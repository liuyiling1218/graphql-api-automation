package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class CommodityDetailPayload {
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
    private String commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 商品品类名称
     */
    private String commodityCategoryName;
    /**
     * 商品品种名称
     */
    private String commodityVarietyName;
    /**
     * 商品产地名称
     */
    private String commodityPlaceOriginName;
    /**
     * 英语
     */
    private String englishName;
    /**
     * 泰语
     */
    private String thailandName;
    /**
     * 越南语
     */
    private String vietnamName;
}