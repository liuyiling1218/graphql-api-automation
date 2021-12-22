package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class UndoSaleOrderInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
    /**
     * 撤销原因
     */
    @Needed
    private String undoDescription;
}