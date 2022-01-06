package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class VarietyInput {
    /**
     *
     */
    private Integer varietyId;
    /**
     *
     */
    @Needed
    private String varietyName;
    /**
     *
     */
    private Integer categoryId;
}