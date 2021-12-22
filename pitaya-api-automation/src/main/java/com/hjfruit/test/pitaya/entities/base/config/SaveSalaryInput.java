package com.hjfruit.test.pitaya.entities.base.config;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class SaveSalaryInput {
    /**
     *
     */
    @Needed
    private Integer configCode;
    /**
     *
     */
    @Needed
    private BigDecimal configValue;
}