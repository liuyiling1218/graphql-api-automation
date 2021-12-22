package com.hjfruit.test.pitaya.entities.label;

import lombok.Data;

/**
 *
 */
@Data
public class RecommendLabelPayload {
    /**
     * 标签Id
     */
    private Integer labelId;
    /**
     * 标签类型 10规格要求 30品质要求
     */
    private Integer labelType;
    /**
     * 品类Id
     */
    private Integer categoryId;
    /**
     * 品类名称
     */
    private String categoryName;
    /**
     * 标签内容
     */
    private String labelContent;
}