package com.hjfruit.test.pitaya.entities.base.user;

import lombok.Data;

/**
 *
 */
@Data
public class UserStoreInput {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 仓库ID
     */
    private Integer storehouseId;
    /**
     * 仓库名称
     */
    private String storehouseName;
}