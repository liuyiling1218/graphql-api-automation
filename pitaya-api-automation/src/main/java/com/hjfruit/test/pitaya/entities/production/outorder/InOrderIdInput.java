package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class InOrderIdInput {
    /**
     * 订单Id
     */
    @Needed
    private String inOrderId;
}