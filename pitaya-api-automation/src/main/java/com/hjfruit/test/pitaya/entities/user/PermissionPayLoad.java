package com.hjfruit.test.pitaya.entities.user;

import lombok.Data;

/**
 *
 */
@Data
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