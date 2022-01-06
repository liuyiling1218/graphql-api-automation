package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class AllocateCostCommodityDetailPayload {
    /**
     * 批次id
     */
    private Integer batchId;
    /**
     * sku id
     */
    private Integer skuId;
    /**
     * 名称
     */
    private String skuName;
    /**
     * 数量
     */
    private BigDecimal quantity;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单品小计
     */
    private BigDecimal totalAmount;
    /**
     * 成本单价
     */
    private BigDecimal costPrice;
}