package com.hjfruit.test.operation.web.entities.production;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class FindUserInput {
    /**
     * 关键词
     */
    private String keyword;
    /**
     * 组织id,所属组织下拉框选择的id
     */
    @Needed
    private Integer orgId;
}