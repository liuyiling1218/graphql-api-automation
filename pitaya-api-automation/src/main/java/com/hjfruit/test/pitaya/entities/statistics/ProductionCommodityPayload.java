package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class ProductionCommodityPayload {
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 商品类型
     */
    private String commodityTypeName;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 规格
     */
    private String commoditySpecOptionName;
    /**
     * 已生产数量
     */
    private BigDecimal completedNum;
    /**
     * 计划生产数量
     */
    private BigDecimal expectNum;
}