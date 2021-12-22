package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommoditySkuStockInput {
    /**
     *
     */
    @Needed
    private List<Integer> commoditySkuId;
    /**
     *
     */
    @Needed
    private Integer commodityTypeId;
    /**
     *
     */
    @Needed
    private Integer warehouseId;
    /**
     *
     */
    @Needed
    private Integer belongId;
    /**
     *
     */
    @Needed
    private Integer belongType;
}