package com.hjfruit.test.pitaya.entities.cost;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageCostOrderPayload {
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
    /**
     *
     */
    private List<CostOrderPayload> records;
}