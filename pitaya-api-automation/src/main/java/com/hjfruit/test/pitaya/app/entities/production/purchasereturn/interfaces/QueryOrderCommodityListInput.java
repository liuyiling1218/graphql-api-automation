package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

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
public class QueryOrderCommodityListInput {
    /**
     * 采购ID
     */
    @Needed
    private String businessId;
}