package com.hjfruit.test.pitaya.entities.user;

import lombok.Data;

/**
 *
 */
@Data
public class ListUserOrgInput {
    /**
     * 非必填 二次登录之后，可以不传
     */
    private String tempToken;
}