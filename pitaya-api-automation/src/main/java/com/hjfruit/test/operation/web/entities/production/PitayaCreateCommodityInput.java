package com.hjfruit.test.operation.web.entities.production;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PitayaCreateCommodityInput {
    /**
     * 商品id
     */
    @Needed
    private Integer commodityId;
    /**
     * 商品类型id
     */
    @Needed
    private Integer commodityTypeId;
}