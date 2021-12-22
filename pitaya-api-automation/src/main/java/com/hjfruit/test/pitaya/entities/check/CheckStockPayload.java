package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CheckStockPayload {
    /**
     *
     */
    private Integer skuId;
    /**
     *
     */
    private Integer commodityTypeId;
    /**
     * 商品名称
     */
    private String commodityTypeName;
    /**
     *
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 批次号
     */
    private Integer batchId;
    /**
     *
     */
    private String batchCode;
    /**
     * 规格字符串，由后端组装
     */
    private List<String> skuTextDescriptionList;
    /**
     * 库存数量
     */
    private Float unitQuantity;
    /**
     * 库存单位
     */
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     * 库存总计数量
     */
    private Float totalQuantity;
    /**
     * 总计数量单位
     */
    private Integer totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     * 归属名称
     */
    private Integer belongId;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     *
     */
    private String belongName;
    /**
     *
     */
    private Float unitPrice;
    /**
     *
     */
    private Integer priceType;
    /**
     *
     */
    private String priceTypeName;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Integer abnormalQuantity;
}