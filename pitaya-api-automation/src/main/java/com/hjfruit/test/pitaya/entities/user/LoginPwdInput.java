package com.hjfruit.test.pitaya.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class LoginPwdInput {
    /**
     *
     */
    @Needed
    private String username;
    /**
     * password:String
     */
    @Needed
    private String pwd;
}