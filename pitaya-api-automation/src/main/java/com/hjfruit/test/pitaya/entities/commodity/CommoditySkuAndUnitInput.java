package com.hjfruit.test.pitaya.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommoditySkuAndUnitInput {
    /**
     *
     */
    @Needed
    private Integer commoditySkuId;
    /**
     *
     */
    @Needed
    private List<Integer> commoditySpecOptionIds;
}