package com.hjfruit.test.pitaya.entities.label;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class CreateQuickLabelInput {
    /**
     * 品类Id
     */
    @Needed
    private Integer categoryId;
    /**
     * 规格要求
     */
    private String specificationLabel;
    /**
     * 品质要求
     */
    private String quantityLabel;
}