package com.hjfruit.test.pitaya.app.entities.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonitorStatusPayload {
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