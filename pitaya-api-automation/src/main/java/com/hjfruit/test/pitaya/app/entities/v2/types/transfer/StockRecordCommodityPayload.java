package com.hjfruit.test.pitaya.app.entities.v2.types.transfer;

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
public class StockRecordCommodityPayload {
    /**
     * skuID
     */
    private Integer commoditySkuId;
    /**
     * 批次ID
     */
    private String stockBatchId;
    /**
     * 批次编码
     */
    private String stockBatchCode;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型
     */
    private Integer unitType;
    /**
     * 总计数量
     */
    private BigDecimal totalQuantity;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单价类型
     */
    private Integer unitPriceType;
    /**
     * 小计金额
     */
    private BigDecimal subtotalAmount;
    /**
     * 单位数量毛重
     */
    private BigDecimal grossUnitQuantity;
}