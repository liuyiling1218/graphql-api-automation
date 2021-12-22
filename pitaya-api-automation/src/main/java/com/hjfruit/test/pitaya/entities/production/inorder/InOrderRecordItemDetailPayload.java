package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class InOrderRecordItemDetailPayload {
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
     * 单价单位类型名称
     */
    private String unitPriceTypeName;
    /**
     * 小计
     */
    private BigDecimal unitTotalPrice;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 副单位与基本单位换算
     */
    private BigDecimal conversion;
    /**
     * 毛重
     */
    private BigDecimal grossUnitQuantity;
}