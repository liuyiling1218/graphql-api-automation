package com.hjfruit.test.pitaya.entities.stock;

import lombok.Data;

/**
 *
 */
@Data
public class PageOutStockRecordInput {
    /**
     * 出库时间
     */
    private Long outStockTime;
    /**
     * 仓库Id
     */
    private Integer warehouseId;
    /**
     * 出库类型Id
     */
    private Integer outOrderTypeId;
    /**
     * 订单号/客户（模糊查询）
     */
    private String keyword;
}