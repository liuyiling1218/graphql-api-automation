package com.hjfruit.test.operation.web.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 获取员工列表入参
 */
@Data
public class PageUserInput {
    /**
     *
     */
    @Needed
    private Integer pageCurrent;
    /**
     *
     */
    @Needed
    private Integer pageSize;
    /**
     * 组织架构Id
     */
    private Integer orgGroupId;
    /**
     * 组织Id
     */
    private Integer orgId;
    /**
     * 名称
     */
    private String name;
}