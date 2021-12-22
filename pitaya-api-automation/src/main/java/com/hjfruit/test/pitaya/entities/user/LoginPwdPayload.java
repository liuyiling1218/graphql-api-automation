package com.hjfruit.test.pitaya.entities.user;

import lombok.Data;

/**
 *
 */
@Data
public class LoginPwdPayload {
    /**
     *
     */
    private String token;
    /**
     * 是否需要修改密码
     */
    private Boolean needUpdatePassword;
}