package com.hjfruit.test.operation.web.entities.stock;

import lombok.Data;

/**
 * 盘点记录
 */
@Data
public class TakeStockRecordInput {
    /**
     * 盘点商户
     */
    private Integer orgId;
    /**
     * 盘点仓库
     */
    private Integer warehouseId;
    /**
     * 起始时间
     */
    private Long startDate;
    /**
     * 截止时间
     */
    private Long expireDate;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
}