package com.hjfruit.test.pitaya.entities.user;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class SendSmsPayload {
    /**
     *
     */
    @Needed
    private Boolean success;
}