package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SaleReturnUpdateInput {
    /**
     *
     */
    @Needed
    private String inOrderId;
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