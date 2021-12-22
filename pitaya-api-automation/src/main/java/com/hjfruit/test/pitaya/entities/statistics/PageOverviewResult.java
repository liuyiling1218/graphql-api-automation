package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;

import java.util.List;
/**
 * 
 */
@Data
public class PageOverviewResult{
    /**
     * 
     */
    private List<OverviewPayload> records;
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