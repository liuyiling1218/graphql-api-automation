package com.hjfruit.test.pitaya.app.entities.user;

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
public class SendSmsPayload {
    /**
     *
     */
    @Needed
    private Boolean success;
}