package com.hjfruit.test.pitaya.app.entities.base.config;

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