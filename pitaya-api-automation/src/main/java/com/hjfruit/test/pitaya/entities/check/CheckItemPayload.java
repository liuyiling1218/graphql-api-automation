package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CheckItemPayload {
    /**
     *
     */
    private Integer checkItemId;
    /**
     *
     */
    private Integer checkId;
    /**
     *
     */
    private Integer checkOrderId;
    /**
     *
     */
    private Integer batchId;
    /**
     *
     */
    private Integer skuId;
    /**
     *
     */
    private String batchCode;
    /**
     *
     */
    private Integer orderType;
    /**
     *
     */
    private Integer orderId;
    /**
     * 盘点商品类型
     */
    private Integer commodityTypeId;
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private List<String> skuTextDescriptionList;
    /**
     *
     */
    private Long unitQuantity;
    /**
     *
     */
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     *
     */
    private Long totalQuantity;
    /**
     *
     */
    private String totalTypeName;
    /**
     *
     */
    private Integer totalType;
    /**
     *
     */
    private Long checkUnitQuantity;
    /**
     *
     */
    private Long checkTotalQuantity;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private Long createTime;
    /**
     * 归属名称
     */
    private Integer belongId;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     * 归属name
     */
    private String belongName;
}