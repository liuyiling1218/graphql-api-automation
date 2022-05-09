package com.hjfruit.test.pitaya.app.entities.base.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomersInput {
    /**
     *
     */
    private String keyword;
    /**
     *
     */
    private CustomerAttribute attribute;
}