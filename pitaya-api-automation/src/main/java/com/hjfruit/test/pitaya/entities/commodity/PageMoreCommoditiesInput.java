package com.hjfruit.test.pitaya.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PageMoreCommoditiesInput {
    /**
     * 模糊查询
     */
    private String commodityName;
    /**
     *
     */
    @Needed
    private Integer customerId;
    /**
     *
     */
    @Needed
    private Integer customerType;
    /**
     *
     */
    @Needed
    private Integer warehouseId;
    /**
     *
     */
    @Needed
    private Integer commodityTypeId;
}