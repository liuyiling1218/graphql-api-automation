package com.hjfruit.test.pitaya.app.entities.base.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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