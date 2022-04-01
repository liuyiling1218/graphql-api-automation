package com.hjfruit.test.pitaya.app.entities.commodity;

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