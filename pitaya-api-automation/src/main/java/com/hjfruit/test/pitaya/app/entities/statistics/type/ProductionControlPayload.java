package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionControlPayload {
    /**
     *
     */
    private LeaderAnalysisPayload leaderAnalysis;
    /**
     *
     */
    private KeeperAnalysisPayload keeperAnalysis;
    /**
     *
     */
    private TaskAnalysisPayload taskAnalysis;
    /**
     *
     */
    private PlanAnalysisPayload planAnalysis;
    /**
     *
     */
    private CommodityAnalysisPaylaod commodityAnalysis;
}