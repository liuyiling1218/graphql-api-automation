package com.hjfruit.test.pitaya.entities.cost;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CostCommodityPayload {
    /**
     * 申请id
     */
    private String applyId;
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
     * 实际单价
     */
    private BigDecimal actualPrice;
    /**
     * 实际总价
     */
    private BigDecimal actualTotalPrice;
}