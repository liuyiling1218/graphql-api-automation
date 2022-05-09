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
public class UserStorePayload {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 仓库ID
     */
    private String storehouseId;
    /**
     * 仓库名称
     */
    private String storehouseName;
}