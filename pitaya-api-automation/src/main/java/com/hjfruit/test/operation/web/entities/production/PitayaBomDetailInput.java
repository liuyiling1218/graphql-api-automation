package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 新增bom明细
 */
@Data
public class PitayaBomDetailInput {
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