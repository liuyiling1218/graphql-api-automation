package com.hjfruit.test.operation.web.entities.label;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class ListLabelsInput {
    /**
     * 要求补充类型 10：规格要求 30：品质要求
     */
    @Needed
    private Integer requestType;
    /**
     * 品类id
     */
    private Integer categoryId;
}