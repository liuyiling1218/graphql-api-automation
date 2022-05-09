package com.hjfruit.test.pitaya.app.entities.convert.type;

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
public class CommandOrderResp {
    /**
     *
     */
    @Needed
    private String orderId;
}