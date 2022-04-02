package com.hjfruit.test.pitaya.app.entities.base.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户账户密码返回
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginResponse {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     *
     */
    private String token;
    /**
     * 组织名称
     */
    private String organizationName;
    /**
     * 组织id
     */
    private Integer organizationId;
}