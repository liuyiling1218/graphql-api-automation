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
public class LoginPayload {
    /**
     *
     */
    private String token;
}