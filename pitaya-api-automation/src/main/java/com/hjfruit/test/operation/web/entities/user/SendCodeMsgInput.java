package com.hjfruit.test.operation.web.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 发送验证码参数
 */
@Data
public class SendCodeMsgInput {
    /**
     * 手机号
     */
    @Needed
    private String phone;
}