package com.hjfruit.test.operation.web.entities.user;

import lombok.Data;

/**
 * 用户信息
 */
@Data
public class UserPayload {
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
     * 头像
     */
    private String avatar;
}