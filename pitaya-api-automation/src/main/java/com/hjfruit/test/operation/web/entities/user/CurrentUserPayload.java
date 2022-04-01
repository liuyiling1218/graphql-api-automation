package com.hjfruit.test.operation.web.entities.user;

import lombok.Data;

import java.util.List;

/**
 * 当前用户信息
 */
@Data
public class CurrentUserPayload {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 团队角色
     */
    private List<String> roleNames;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 公司名称
     */
    private String organizationName;
}