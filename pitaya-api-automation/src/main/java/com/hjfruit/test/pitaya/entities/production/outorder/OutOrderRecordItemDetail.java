package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class OutOrderRecordItemDetail {
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
     * 小单位类型
     */
    private Integer unitType;
    /**
     * 小单位类型名称
     */
    private String unitTypeName;
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
    private String unitPrice;
    /**
     * 单价单位
     */
    private String unitPriceTypeName;
    /**
     * 小计
     */
    private String unitTotalPrice;
    /**
     * 周转筐数量
     */
    private Integer basketQuantity;
    /**
     * 周转筐归属名称
     */
    private String basketCustomerName;
    /**
     * 批次号等信息
     */
    private List<BatchItemPayload> batchItem;
}