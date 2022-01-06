package com.hjfruit.test.operation.web.entities.label;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class UpdateLabelInput {
    /**
     * 标签id
     */
    @Needed
    private Integer labelId;
    /**
     * 标签内容
     */
    @Needed
    private String labelContent;
    /**
     * 要求补充类型 10：规格要求 20：品质要求
     */
    @Needed
    private Integer requestType;
}