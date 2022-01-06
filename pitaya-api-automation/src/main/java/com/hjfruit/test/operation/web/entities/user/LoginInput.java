package com.hjfruit.test.operation.web.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 登陆参数
 */
@Data
public class LoginInput {
    /**
     * 手机号
     */
    @Needed
    private String phone;
    /**
     * 验证码
     */
    @Needed
    private String code;
}