package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 未添加商品列表添加商品
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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