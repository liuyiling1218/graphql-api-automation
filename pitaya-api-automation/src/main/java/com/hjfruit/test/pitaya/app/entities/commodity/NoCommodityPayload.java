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
public class NoCommodityPayload {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
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
}