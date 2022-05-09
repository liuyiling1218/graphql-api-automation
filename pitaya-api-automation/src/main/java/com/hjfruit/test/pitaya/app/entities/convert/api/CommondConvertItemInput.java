package com.hjfruit.test.pitaya.app.entities.convert.api;

import fc.test.api.graphql.annotation.Needed;
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
public class CommondConvertItemInput {
    /**
     *
     */
    @Needed
    private String batchId;
    /**
     *
     */
    @Needed
    private Integer skuId;
    /**
     *
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     *
     */
    @Needed
    private BigDecimal totalQuantity;
}