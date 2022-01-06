package com.hjfruit.test.pitaya.app.entities.cost;

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
public class CostCommodityPayload {
    /**
     * 货款明细ID
     */
    private String itemId;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * 商品规格名称
     */
    private String commoditySpecOptionName;
    /**
     * 商品sku
     */
    private Integer skuId;
    /**
     * 小单位类型
     */
    private Integer unitType;
    /**
     * 副单位类型
     */
    private Integer totalType;
    /**
     * 小单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 副单位数量
     */
    private BigDecimal totalQuantity;
    /**
     * 单位数量毛重
     */
    private BigDecimal grossUnitQuantity;
    /**
     * 小单位名称
     */
    private String unitTypeName;
    /**
     * 副单位名称
     */
    private String totalTypeName;
    /**
     * 果品单价定位（0其他 10净重 20毛重）
     */
    private Integer pricePosition;
    /**
     * 单价类型
     */
    private Integer priceType;
    /**
     * 单价类型名称
     */
    private String priceTypeName;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 小计
     */
    private BigDecimal totalAmount;
}