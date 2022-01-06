package com.hjfruit.test.operation.web.entities.org;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PageOrgGroupInput {
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
     * 组织架构名称
     */
    private String name;
}