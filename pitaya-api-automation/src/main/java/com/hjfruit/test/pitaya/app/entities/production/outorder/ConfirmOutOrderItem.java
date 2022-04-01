package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmOutOrderItem {
    /**
     *
     */
    @Needed
    private String outOrderItemId;
    /**
     * 周转筐数量
     */
    private Integer basketQuantity;
    /**
     * 周转筐归属
     */
    private Integer basketCustomerId;
    /**
     * 批次及数量
     */
    @Needed
    private List<BatchStockItem> batchStockItems;
}