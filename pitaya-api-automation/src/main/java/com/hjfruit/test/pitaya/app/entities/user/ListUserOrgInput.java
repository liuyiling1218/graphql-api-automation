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
public class ListUserOrgInput {
    /**
     * 非必填 二次登录之后，可以不传
     */
    private String tempToken;
}