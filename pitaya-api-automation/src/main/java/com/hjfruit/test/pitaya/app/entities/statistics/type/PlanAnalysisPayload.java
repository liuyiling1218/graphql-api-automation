package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 计划分析
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanAnalysisPayload {
    /**
     *
     */
    private Integer totalPlan;
    /**
     *
     */
    private Integer productionSale;
    /**
     *
     */
    private Integer completedSale;
    /**
     *
     */
    private Integer undoneSale;
    /**
     *
     */
    private Integer productionStock;
    /**
     *
     */
    private Integer completedStock;
    /**
     *
     */
    private Integer undoneStock;
}