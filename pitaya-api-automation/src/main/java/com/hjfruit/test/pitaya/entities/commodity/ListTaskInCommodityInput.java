package com.hjfruit.test.pitaya.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class ListTaskInCommodityInput {
    /**
     *
     */
    @Needed
    private String taskId;
    /**
     *
     */
    @Needed
    private Integer inOrderType;
    /**
     *
     */
    @Needed
    private Integer commodityType;
}