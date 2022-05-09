package com.hjfruit.test.pitaya.app.entities.base.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 仓库列表下拉
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehousePayload {
    /**
     *
     */
    private String warehouseId;
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