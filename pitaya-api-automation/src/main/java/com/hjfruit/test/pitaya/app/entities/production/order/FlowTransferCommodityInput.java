package com.hjfruit.test.pitaya.app.entities.production.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowTransferCommodityInput {
    /**
     * sku id
     */
    private Integer skuId;
    /**
     * 批次id
     */
    private String batchId;
    /**
     * 总计数量
     */
    private BigDecimal totalQuantity;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型
     */
    private Integer unitType;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单价类型
     */
    private Integer priceType;
    /**
     * 金额
     */
    private BigDecimal amount;
}