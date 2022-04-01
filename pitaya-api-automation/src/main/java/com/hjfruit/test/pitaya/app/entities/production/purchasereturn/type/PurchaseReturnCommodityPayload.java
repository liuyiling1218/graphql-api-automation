package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type;

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
public class PurchaseReturnCommodityPayload {
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
}