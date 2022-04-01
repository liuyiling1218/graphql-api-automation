package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

/**
 *
 */
@Data
public class FindUserPayload {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户电话
     */
    private String phone;
}