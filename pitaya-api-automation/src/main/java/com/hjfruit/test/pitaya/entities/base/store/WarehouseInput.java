package com.hjfruit.test.pitaya.entities.base.store;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
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