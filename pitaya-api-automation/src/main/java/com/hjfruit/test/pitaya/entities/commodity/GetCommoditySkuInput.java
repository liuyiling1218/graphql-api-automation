package com.hjfruit.test.pitaya.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class GetCommoditySkuInput {
    /**
     *
     */
    @Needed
    private Integer commoditySkuId;
}