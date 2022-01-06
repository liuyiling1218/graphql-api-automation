package com.hjfruit.test.pitaya.entities.production.purchasereturn.type;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class InStockOrderCommodityPayload {
    /**
     * skuID
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private List<String> skuTextDescription;
    /**
     *
     */
    private BigDecimal conversion;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型
     */
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     * 总计数量
     */
    private BigDecimal totalQuantity;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单价类型
     */
    private Integer unitPriceType;
    /**
     *
     */
    private String unitPriceTypeName;
    /**
     * 待入库单位数量
     */
    private BigDecimal waitUnitQuantity;
    /**
     * 待入库总计数量
     */
    private BigDecimal waitTotalQuantity;
    /**
     * 已入库单位数量
     */
    private BigDecimal stockedUnitQuantity;
    /**
     * 已入库总计数量
     */
    private BigDecimal stockedTotalQuantity;
    /**
     * 小计金额
     */
    private BigDecimal subtotalAmount;
}