package com.hjfruit.test.pitaya.app.entities.production.outorder;

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