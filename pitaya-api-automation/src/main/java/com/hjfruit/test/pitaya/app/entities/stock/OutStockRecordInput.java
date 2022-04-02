package com.hjfruit.test.pitaya.app.entities.stock;

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
public class OutStockRecordInput {
    /**
     *
     */
    @Needed
    private String outStockRecordId;
}