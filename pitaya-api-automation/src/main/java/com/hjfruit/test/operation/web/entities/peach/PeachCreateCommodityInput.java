package com.hjfruit.test.operation.web.entities.peach;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PeachCreateCommodityInput {
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
    /**
     * 商品品类ID
     */
    @Needed
    private Integer commodityCategoryId;
}