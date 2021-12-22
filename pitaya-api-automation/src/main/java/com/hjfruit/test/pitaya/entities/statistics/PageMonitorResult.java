package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;

import java.util.List;
/**
 * 
 */
@Data
public class PageMonitorResult{
    /**
     * 
     */
    private List<MonitorPayload> records;
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