package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

/**
 * 未添加商品列表添加商品
 */
@Data
public class CreateCommodityInput {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
}