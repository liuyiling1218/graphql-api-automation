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
public class RoleInput {
    /**
     *
     */
    private Integer roleId;
    /**
     *
     */
    private String roleName;
}