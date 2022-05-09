package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 组长情况
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaderAnalysisPayload {
    /**
     *
     */
    private Integer leaderQuantity;
    /**
     *
     */
    private Integer totalTask;
    /**
     *
     */
    private Integer completedTask;
    /**
     *
     */
    private Integer undoneTask;
    /**
     *
     */
    private BigDecimal orderQuantity;
    /**
     *
     */
    private BigDecimal completedOrder;
    /**
     *
     */
    private BigDecimal undoneOrder;
}