package com.hjfruit.test.pitaya.entities.user;

import lombok.Data;

/**
 *
 */
@Data
public class ChangePwdInput {
    /**
     *
     */
    private String oldPwd;
    /**
     *
     */
    private String newPwd;
}