package com.hjfruit.test.pitaya.entities.common;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class DevicePlatformInput {
    /**
     * WEB 0ANDROID 1IOS 2
     */
    @Needed
    private Integer device;
}