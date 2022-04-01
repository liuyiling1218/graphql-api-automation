package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 更新bom明细
 */
@Data
public class PitayaUpdateBomDetailInput {
    /**
     * 配料id
     */
    private Integer commodityBomDetailId;
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 数量
     */
    private BigDecimal quantity;
    /**
     * 数量单位
     */
    private Integer quantityUnit;
}