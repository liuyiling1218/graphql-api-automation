package com.hjfruit.test.pitaya.app.entities.base.store;

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
public class WarehouseInput {
    /**
     *
     */
    private Integer warehouseId;
    /**
     *
     */
    @Needed
    private String warehouseName;
    /**
     *
     */
    private String houseNumber;
    /**
     *
     */
    @Needed
    private String address;
    /**
     *
     */
    private String remark;
}