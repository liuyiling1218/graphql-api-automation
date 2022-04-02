package com.hjfruit.test.pitaya.app.entities.push;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDevicePayload {
    /**
     *
     */
    private Integer userId;
    /**
     *
     */
    private Integer platformType;
}