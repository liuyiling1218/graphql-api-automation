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