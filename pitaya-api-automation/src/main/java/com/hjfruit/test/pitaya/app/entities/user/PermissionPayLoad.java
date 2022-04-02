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
public class PermissionPayLoad {
    /**
     *
     */
    private Integer authId;
    /**
     *
     */
    private String authKey;
    /**
     *
     */
    private String authPath;
    /**
     *
     */
    private String authName;
    /**
     *
     */
    private Integer leaf;
}