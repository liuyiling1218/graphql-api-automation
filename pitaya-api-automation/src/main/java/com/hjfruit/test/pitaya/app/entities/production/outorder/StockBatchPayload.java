package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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