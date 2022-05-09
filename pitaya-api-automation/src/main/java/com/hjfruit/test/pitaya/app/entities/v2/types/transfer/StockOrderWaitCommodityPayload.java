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
public class StockOrderWaitCommodityPayload {
    /**
     * skuID
     */
    private Integer commoditySkuId;
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
     * 果品单价定位
     */
    private Integer pricePosition;
}