package com.hjfruit.test.pitaya.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class LoginInput {
    /**
     *
     */
    @Needed
    private String username;
    /**
     * password:String or sms code
     */
    @Needed
    private String checkCode;
}