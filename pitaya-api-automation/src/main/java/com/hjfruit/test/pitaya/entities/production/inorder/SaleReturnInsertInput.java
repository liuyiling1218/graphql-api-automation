package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
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