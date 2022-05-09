package com.hjfruit.test.pitaya.app.entities.base.supplier;

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
public class GetSupplierInput {
    /**
     *
     */
    @Needed
    private Integer supplierId;
    /**
     *
     */
    @Needed
    private Integer supplierTypeId;
}