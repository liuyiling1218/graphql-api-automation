package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * sku列表表头sku列表
 */
@Data
public class PitayaPageSkuInput {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 规格筛选
     */
    private List<SkuCondition> skuCondition;
}