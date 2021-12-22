package com.hjfruit.test.pitaya.entities.stock;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageStockBatchPayLoad {
    /**
     *
     */
    private List<StockBatchPayloadV2> records;
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
    private Long totalRecords;
}