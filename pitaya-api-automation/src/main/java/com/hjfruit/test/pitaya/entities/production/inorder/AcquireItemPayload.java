package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class AcquireItemPayload {
    /**
     * 商品skuID
     */
    private Integer skuId;
    /**
     * SPU名称
     */
    private String commodityName;
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
     * 单价定位(10净重，20毛重)
     */
    private Integer pricePosition;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 单价单位Id
     */
    private Integer priceType;
    /**
     * 单价单位名称
     */
    private String priceTypeName;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 副单位与基本单位关系转换
     */
    private BigDecimal conversion;
}