package com.hjfruit.test.pitaya.app.entities.base.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInput {
    /**
     * 用户id
     */
    @Needed
    private Integer storehouseId;
    /**
     * 用户名称
     */
    private String roleName;
}