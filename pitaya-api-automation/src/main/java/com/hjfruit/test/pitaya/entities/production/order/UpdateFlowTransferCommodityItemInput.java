package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class UpdateFlowTransferCommodityItemInput {
    /**
     * item id
     */
    private String itemId;
    /**
     * sku id
     */
    private Integer skuId;
    /**
     * 批次id
     */
    private Integer batchId;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 总计数量
     */
    private BigDecimal totalQuantity;
    /**
     * 单价类型
     */
    private Integer priceType;
    /**
     * 小计
     */
    private BigDecimal amount;
}