package com.hjfruit.test.pitaya.app.entities.base.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 组织ID
     */
    private Integer orgId;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 组织架构
     */
    private Integer orgGroupId;
    /**
     * 组织架构名称
     */
    private String orgGroupName;
    /**
     * 组织所属系统
     */
    private Integer appId;
}