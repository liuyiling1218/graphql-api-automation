package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class AuditInOrderItemPayload {
    /**
     * item列表Id
     */
    private String inOrderItemId;
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
     * 小单位类型名称
     */
    private String unitTypeName;
    /**
     * 副单位数量
     */
    private BigDecimal totalQuantity;
    /**
     * 副单位类型名称
     */
    private String totalTypeName;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     *
     */
    private Integer unitPriceType;
    /**
     * 单价类型名称
     */
    private String unitPriceTypeName;
    /**
     * 小计
     */
    private BigDecimal unitTotalPrice;
    /**
     * 待入库小单位数量
     */
    private BigDecimal waitUnitQuantity;
    /**
     * 待入库副单位数量
     */
    private BigDecimal waitTotalQuantity;
    /**
     * 是否完成入库
     */
    private Integer completeInStock;
    /**
     * 副单位与基本单位换算
     */
    private BigDecimal conversion;
    /**
     * 单价类型 10 净重 20 毛重
     */
    private Integer pricePosition;
    /**
     * 毛重数量
     */
    private BigDecimal grossUnitQuantity;
}