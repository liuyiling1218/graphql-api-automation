package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
public class WasteSaleOrder {
    /**
     *
     */
    private String saleOrderId;
    /**
     *
     */
    private String saleOrderCode;
    /**
     *
     */
    private Integer orgId;
    /**
     *
     */
    private String orgName;
    /**
     *
     */
    private Integer warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     *
     */
    private String spu;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private List<String> photos;
    /**
     *
     */
    private BigDecimal totalSalePrice;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private String createByName;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Long updateTime;
    /**
     *
     */
    private Integer updateBy;
}