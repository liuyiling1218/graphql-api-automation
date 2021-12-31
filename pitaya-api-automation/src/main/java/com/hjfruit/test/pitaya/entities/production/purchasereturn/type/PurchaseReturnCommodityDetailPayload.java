package com.hjfruit.test.pitaya.entities.production.purchasereturn.type;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class PurchaseReturnCommodityDetailPayload {
    /**
     * 商品SKU_ID
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
     * 商品单位类型
     */
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     * 商品单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 商品总计数量
     */
    private BigDecimal totalQuantity;
    /**
     * 商品总计类型
     */
    private Integer totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     * 已入库数量
     */
    private BigDecimal storedUnitQuantity;
    /**
     *
     */
    private BigDecimal storedTotalQuantity;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单价定价类型
     */
    private Integer unitPriceType;
    /**
     *
     */
    private String unitPriceTypeName;
    /**
     * 金额小计
     */
    private BigDecimal totalPrice;
}