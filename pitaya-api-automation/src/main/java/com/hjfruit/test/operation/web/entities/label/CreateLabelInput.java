package com.hjfruit.test.operation.web.entities.label;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class CreateLabelInput {
    /**
     * 品类id
     */
    @Needed
    private Integer categoryId;
    /**
     * 标签内容
     */
    @Needed
    private String labelContent;
    /**
     * 请求类型 10：规格要求 30：品质要求
     */
    @Needed
    private Integer requestType;
}