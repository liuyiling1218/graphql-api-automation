package com.hjfruit.test.pitaya.entities.cost;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdateCostOrderInput {
    /**
     * 申请id
     */
    @Needed
    private String applyId;
    /**
     *
     */
    private List<UpdateCommodityPriceInput> commodityItems;
    /**
     *
     */
    private List<UpdateFreightCostInput> freightCostItems;
}