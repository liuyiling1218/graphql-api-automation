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