package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class ProductObj {
    /**
     *
     */
    private String productName;
    /**
     *
     */
    private BigDecimal quantity;
    /**
     *
     */
    private String unit;
}