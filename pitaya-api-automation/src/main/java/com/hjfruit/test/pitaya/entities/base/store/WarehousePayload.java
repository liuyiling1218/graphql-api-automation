package com.hjfruit.test.pitaya.entities.base.store;

import lombok.Data;

/**
 * 仓库列表下拉
 */
@Data
public class WarehousePayload {
    /**
     *
     */
    private Integer warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     *
     */
    private String address;
    /**
     *
     */
    private String houseNumber;
    /**
     *
     */
    private String remark;
}