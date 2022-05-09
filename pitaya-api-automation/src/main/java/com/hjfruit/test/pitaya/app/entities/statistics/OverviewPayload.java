package com.hjfruit.test.pitaya.app.entities.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OverviewPayload {
    /**
     * 配送地址名称
     */
    private String customerDistributionName;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 状态名称
     */
    private String planStatusName;
    /**
     * 状态id
     */
    private Integer planStatusId;
    /**
     * 生产类型id
     */
    private Integer createType;
    /**
     * 生产类型
     */
    private String createTypeName;
    /**
     * 商品品类数量
     */
    private Integer productionTypeNum;
    /**
     * 已生产总数
     */
    private BigDecimal completedNumSum;
    /**
     * 计划生产总数
     */
    private BigDecimal expectNumSum;
    /**
     * 期望销售数量总数
     */
    private BigDecimal expectSaleNumSum;
    /**
     * 出库数量总数
     */
    private BigDecimal outStockNumSum;
    /**
     * 提交人
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 计划id
     */
    private String planId;
    /**
     *
     */
    private List<OverviewDetailPayload> overviewDetail;
}