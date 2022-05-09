package com.hjfruit.test.pitaya.app.entities.convert.api;

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
public class CommondOrderStatusInput {
    /**
     *
     */
    @Needed
    private String orderId;
    /**
     *
     */
    private String statusRemark;
}