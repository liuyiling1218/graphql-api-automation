package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class SaleReturnInsertInput {
    /**
     *
     */
    @Needed
    private String outOrderId;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    @Needed
    private List<SaleReturnItemPayload> commodities;
}