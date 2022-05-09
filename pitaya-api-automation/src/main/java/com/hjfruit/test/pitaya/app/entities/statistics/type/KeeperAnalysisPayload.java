package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 库管情况
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeeperAnalysisPayload {
    /**
     *
     */
    private Integer keeperQuantity;
    /**
     *
     */
    private Integer inStockTotal;
    /**
     *
     */
    private Integer outStockTotal;
}