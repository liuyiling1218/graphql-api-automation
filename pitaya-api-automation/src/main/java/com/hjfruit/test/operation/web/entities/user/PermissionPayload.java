package com.hjfruit.test.operation.web.entities.user;

import lombok.Data;

/**
 * 权限列表
 */
@Data
public class PermissionPayload {
    /**
     * 权限码
     */
    private String code;
    /**
     * 待办数量
     */
    private Integer todoCount;
}