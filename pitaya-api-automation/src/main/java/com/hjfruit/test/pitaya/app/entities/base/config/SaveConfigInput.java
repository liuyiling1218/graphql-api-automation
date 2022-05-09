package com.hjfruit.test.pitaya.app.entities.base.config;

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