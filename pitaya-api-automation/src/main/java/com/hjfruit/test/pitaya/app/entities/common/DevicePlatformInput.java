package com.hjfruit.test.pitaya.app.entities.common;

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
public class DevicePlatformInput {
    /**
     * WEB 0ANDROID 1IOS 2
     */
    @Needed
    private Integer device;
}