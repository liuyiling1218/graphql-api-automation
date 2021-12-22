package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 待出库商品信息
 */
@Data
public class ToBeOutbount {
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
     * 小单位类型名称
     */
    private String unitTypeName;
    /**
     * 副单位数量
     */
    private String totalQuantity;
    /**
     * 副单位类型名称
     */
    private String totalTypeName;
}