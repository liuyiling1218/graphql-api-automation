package com.hjfruit.test.operation.web.entities.label;

import lombok.Data;

/**
 *
 */
@Data
public class ListDropDownLabelsPayload {
    /**
     * 品类id
     */
    private Integer categoryId;
    /**
     * 品类名称
     */
    private String categoryName;
}