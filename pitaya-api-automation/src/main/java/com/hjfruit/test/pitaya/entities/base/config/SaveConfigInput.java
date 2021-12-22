package com.hjfruit.test.pitaya.entities.base.config;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class SaveConfigInput {
    /**
     *
     */
    @Needed
    private Integer configCode;
    /**
     *
     */
    @Needed
    private Boolean configValue;
}