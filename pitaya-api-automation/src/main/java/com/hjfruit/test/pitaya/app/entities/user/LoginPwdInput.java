package com.hjfruit.test.pitaya.app.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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