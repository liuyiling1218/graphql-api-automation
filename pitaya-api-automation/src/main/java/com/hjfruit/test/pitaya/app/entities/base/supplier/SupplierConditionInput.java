package com.hjfruit.test.pitaya.app.entities.base.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierConditionInput {
    /**
     *
     */
    private String keyword;
    /**
     *
     */
    private List<Integer> supplierTypeId;
    /**
     *
     */
    private SupplierAttribute attribute;
}