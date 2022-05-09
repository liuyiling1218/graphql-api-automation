package com.hjfruit.test.pitaya.app.entities.v2.types.transfer;

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
public class OutStockOrderWaitCommodityPayload {
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
     * 单位类型名称
     */
    private String unitTypeName;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 单价类型名称
     */
    private String unitPriceTypeName;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品规格选项
     */
    private List<String> commoditySpecOptionName;
    /**
     *
     */
    private BigDecimal conversion;
}