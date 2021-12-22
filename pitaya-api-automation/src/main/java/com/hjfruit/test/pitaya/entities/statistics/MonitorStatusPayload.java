package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;
/**
 * 
 */
@Data
public class MonitorStatusPayload{
    /**
     * 待生产数量
     */
    private Integer toBeProduced;
    /**
     * 生产中数量
     */
    private Integer inProduction;
    /**
     * 已完成数量
     */
    private Integer completed;
}