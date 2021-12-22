package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class OtherInOrderItemPayload {
    /**
     * SPUId
     */
    private Integer commodityId;
    /**
     * SPU名称
     */
    private String commodityName;
    /**
     * 商品skuID
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项Id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * 规格选项
     */
    private List<String> skuTextDescription;
    /**
     * 小单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 小单位类型
     */
    private Integer unitType;
    /**
     * 小单位类型名称
     */
    private String unitTypeName;
    /**
     * 副单位数量
     */
    private BigDecimal totalQuantity;
    /**
     * 副单位类型
     */
    private Integer totalType;
    /**
     * 副单位类型名称
     */
    private String totalTypeName;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 单价单位Id
     */
    private Integer unitPriceType;
    /**
     * 单价单位名称
     */
    private String unitPriceTypeName;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
}