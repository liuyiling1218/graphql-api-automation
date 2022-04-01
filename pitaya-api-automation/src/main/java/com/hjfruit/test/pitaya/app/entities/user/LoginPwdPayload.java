package com.hjfruit.test.pitaya.app.entities.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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