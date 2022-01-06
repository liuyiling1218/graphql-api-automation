package com.hjfruit.test.pitaya.app.entities.stock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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