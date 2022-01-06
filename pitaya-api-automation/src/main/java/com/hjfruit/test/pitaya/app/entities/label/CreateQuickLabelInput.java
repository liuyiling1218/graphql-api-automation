package com.hjfruit.test.pitaya.app.entities.label;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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