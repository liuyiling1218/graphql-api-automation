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
public class BindOrgInput {
    /**
     *
     */
    private Integer orgId;
    /**
     *
     */
    private String bindToken;
}