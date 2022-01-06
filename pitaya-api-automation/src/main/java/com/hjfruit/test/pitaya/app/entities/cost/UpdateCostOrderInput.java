package com.hjfruit.test.pitaya.app.entities.cost;

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
public class UpdateCostOrderInput {
    /**
     * 申请id
     */
    @Needed
    private String billId;
    /**
     *
     */
    private String commodityRemark;
    /**
     *
     */
    private String commodityRemark;
    /**
     *
     */
    private List<UpdateCommodityPriceInput> commodityItems;
    /**
     *
     */
    private List<UpdateFreightCostInput> freightCostItems;
}