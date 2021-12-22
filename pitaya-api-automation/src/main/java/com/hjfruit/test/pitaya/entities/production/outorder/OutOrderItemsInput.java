package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class OutOrderItemsInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
    /**
     * 是否完成出库 1 是 99 否
     */
    private Integer completeOutStock;
}