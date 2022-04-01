package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * 条件获取sku列表
 */
@Data
public class PitayaConditionToGetSkuInput {
    /**
     *
     */
    private List<Integer> commodityTypeId;
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private String commoditySpecName;
    /**
     *
     */
    private List<Integer> property;
    /**
     * 是否未配置bom
     */
    private Integer noBom;
    /**
     * 排除商品id
     */
    private List<Integer> excludeSkuIds;
}