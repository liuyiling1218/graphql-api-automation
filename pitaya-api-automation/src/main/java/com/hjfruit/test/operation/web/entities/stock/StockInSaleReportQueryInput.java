package com.hjfruit.test.operation.web.entities.stock;

import lombok.Data;

/**
 * 在售库存入参
 */
@Data
public class StockInSaleReportQueryInput {
    /**
     * 入库时间起
     */
    private Long warehouseStartTime;
    /**
     * 入库时间终
     */
    private Long warehouseEndTime;
}