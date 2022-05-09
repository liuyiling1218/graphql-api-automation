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
public class KeeperConditionPayload {
    /**
     *
     */
    private String keeperName;
    /**
     *
     */
    private Integer inStockTotal;
    /**
     *
     */
    private CommodityOperatePayload inStockOperate;
    /**
     *
     */
    private Integer outStockTotal;
    /**
     *
     */
    private CommodityOperatePayload outStockOperate;
}