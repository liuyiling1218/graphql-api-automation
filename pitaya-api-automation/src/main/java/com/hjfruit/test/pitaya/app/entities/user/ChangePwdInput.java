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