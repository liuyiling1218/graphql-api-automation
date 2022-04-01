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
public class ListPlanCommoditySkuInput {
    /**
     *
     */
    @Needed
    private String planId;
}