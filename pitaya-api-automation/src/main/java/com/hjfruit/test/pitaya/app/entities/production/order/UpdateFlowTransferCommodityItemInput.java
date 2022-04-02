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
    private String batchId;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 小计
     */
    private BigDecimal amount;
}