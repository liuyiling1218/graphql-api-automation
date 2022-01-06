package com.hjfruit.test.operation.web.entities.merchant;

import lombok.Data;

/**
 *
 */
@Data
public class SearchUserPayload {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 是否被使用 0未使用，1已使用
     */
    private Integer used;
}