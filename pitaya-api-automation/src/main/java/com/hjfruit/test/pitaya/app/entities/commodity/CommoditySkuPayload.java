package com.hjfruit.test.pitaya.app.entities.commodity;

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
public class CommoditySkuPayload {
    /**
     *
     */
    private CommodityPayload commodityPayload;
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private Integer status;
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
    private Integer totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     *
     */
    private List<Integer> property;
    /**
     *
     */
    private Integer bomId;
    /**
     *
     */
    private Integer createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private Integer updateTime;
    /**
     *
     */
    private Integer updateBy;
    /**
     *
     */
    private Integer Deleted;
    /**
     *
     */
    private List<Integer> commoditySpecOptionId;
    /**
     *
     */
    private List<String> skuTextDescription;
}