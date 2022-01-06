package com.hjfruit.test.operation.web.entities.merchant;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 查找用户信息
 */
@Data
public class SearchUserInput {
    /**
     * 关键词：手机号/用户名称
     */
    private String keyword;
    /**
     * 组织ID
     */
    @Needed
    private Integer orgId;
}