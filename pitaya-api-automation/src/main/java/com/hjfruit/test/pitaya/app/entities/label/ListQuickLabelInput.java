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
public class ListQuickLabelInput {
    /**
     * 10规格要求 30品质要求
     */
    @Needed
    private Integer labelType;
    /**
     * 规格Id
     */
    @Needed
    private Integer categoryId;
}