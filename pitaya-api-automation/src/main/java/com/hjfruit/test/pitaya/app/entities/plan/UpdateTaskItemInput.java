package com.hjfruit.test.pitaya.app.entities.plan;

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