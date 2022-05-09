package com.hjfruit.test.pitaya.app.entities.check;

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
public class CheckItemPayload {
    /**
     *
     */
    private Integer checkItemId;
    /**
     *
     */
    private String checkId;
    /**
     *
     */
    private Integer checkOrderId;
    /**
     *
     */
    private String batchId;
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
    private BigDecimal unitQuantity;
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
    private BigDecimal totalQuantity;
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
    private BigDecimal checkUnitQuantity;
    /**
     *
     */
    private BigDecimal checkTotalQuantity;
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