package com.hjfruit.test.pitaya.app.entities.plan;

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