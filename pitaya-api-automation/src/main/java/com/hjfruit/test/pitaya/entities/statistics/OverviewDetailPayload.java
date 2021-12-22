package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;

import java.math.BigDecimal;
/**
 * 
 */
@Data
public class OverviewDetailPayload{
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品规格
     */
    private String commoditySpecOptionName;
    /**
     * 期望销售数量
     */
    private BigDecimal expectSaleNum;
    /**
     * 已生产数量
     */
    private BigDecimal completedNum;
    /**
     * 计划生产
     */
    private BigDecimal expectNum;
    /**
     * 出库数量
     */
    private BigDecimal outStockNum;
    /**
     * 组长
     */
    private String leaderName;
    /**
     * 生产线
     */
    private String line;
    /**
     * 
     */
    private String totalTypeName;
}