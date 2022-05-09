package com.hjfruit.test.pitaya.app.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String warehouseId;
    /**
     *
     */
    @Needed
    private Integer commodityTypeId;
}