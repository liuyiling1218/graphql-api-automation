package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class StockBatchPayload {
    /**
     *
     */
    private Integer batchId;
    /**
     *
     */
    private String batchCode;
    /**
     *
     */
    private BigDecimal unitQuantity;
    /**
     *
     */
    private BigDecimal totalQuantity;
    /**
     *
     */
    private String unitTypeName;
    /**
     *
     */
    private String totalTypeName;
    /**
     *
     */
    private Integer unitType;
    /**
     *
     */
    private Integer totalType;
    /**
     *
     */
    private Long createTime;
}