package com.hjfruit.test.pitaya.entities.base.supplier;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SupplierConditionInput {
    /**
     *
     */
    private String keyword;
    /**
     *
     */
    private List<Integer> commodityTypeIdList;
}