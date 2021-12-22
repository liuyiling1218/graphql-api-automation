package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class CancelOutOrderInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
    /**
     *
     */
    @Needed
    private String outOrderDescription;
}