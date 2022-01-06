package com.hjfruit.test.operation.web.entities.user;

import lombok.Data;

import java.util.List;

/**
 * 用户管理信息
 */
@Data
public class UserManagePayload {
    /**
     * id
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 所属组织架构名称
     */
    private String orgGroupName;
    /**
     * 所属组织架构ID
     */
    private Integer orgGroupId;
    /**
     * 所属组织名称
     */
    private String orgName;
    /**
     * 所属组织ID
     */
    private Integer orgId;
    /**
     * 关联组织IDs
     */
    private List<Integer> relOrgIds;
}