package com.hjfruit.test.operation.web.entities.stock;

import lombok.Data;

import java.util.List;

/**
 * 盘点记录列表
 */
@Data
public class PageTakeStockRecordListPayload {
    /**
     *
     */
    private List<TakeStockRecordPayload> records;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Integer totalRecords;
}