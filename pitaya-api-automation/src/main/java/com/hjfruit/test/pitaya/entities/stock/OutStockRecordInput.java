package com.hjfruit.test.pitaya.entities.stock;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class OutStockRecordInput {
    /**
     *
     */
    @Needed
    private String outStockRecordId;
}