package com.hjfruit.test.operation.web.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UserMangerInput {
    /**
     *
     */
    private Integer id;
    /**
     * 组织Id
     */
    @Needed
    private Integer orgId;
    /**
     * 组织架构Id
     */
    @Needed
    private Integer orgGroupId;
    /**
     * 手机号
     */
    @Needed
    private String phone;
    /**
     * 用户账号
     */
    @Needed
    private String userAccount;
    /**
     * 名称
     */
    @Needed
    private String name;
    /**
     * 关联组织ID
     */
    private List<Integer> relOrgIds;
}