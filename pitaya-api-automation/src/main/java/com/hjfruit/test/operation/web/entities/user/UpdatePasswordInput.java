package com.hjfruit.test.operation.web.entities.user;

import lombok.Data;

/**
 *
 */
@Data
public class UpdatePasswordInput {
    /**
     *
     */
    private Integer id;
    /**
     * 密码
     */
    private String password;
}