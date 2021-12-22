package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class UpdateTaskItemInput {
    /**
     *
     */
    @Needed
    private Integer commoditySkuId;
    /**
     *
     */
    private BigDecimal expectNum;
}