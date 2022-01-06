package com.hjfruit.test.operation.web.entities.label;

import lombok.Data;

/**
 *
 */
@Data
public class ListLabels {
    /**
     * 标签id
     */
    private Integer labelId;
    /**
     * 标签类型 10：推荐标签 20：快捷标签
     */
    private Integer labelType;
    /**
     * 品类id
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
    /**
     * 组织id
     */
    private Integer organizationId;
    /**
     * 组织名称
     */
    private String organizationName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人员id
     */
    private Integer createBy;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人员id
     */
    private Integer updateBy;
    /**
     * 删除标识 1：删除 99：未删除
     */
    private Integer deleted;
}