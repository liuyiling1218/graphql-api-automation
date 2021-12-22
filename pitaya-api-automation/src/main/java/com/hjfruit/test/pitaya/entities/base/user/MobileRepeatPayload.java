package com.hjfruit.test.pitaya.entities.base.user;

import lombok.Data;

/**
 *
 */
@Data
public class MobileRepeatPayload {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String mobile;
}