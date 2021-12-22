package com.hjfruit.test.pitaya.entities.stock;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class StockPageResultPayload {
    /**
     *
     */
    private List<StockPayload> records;
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