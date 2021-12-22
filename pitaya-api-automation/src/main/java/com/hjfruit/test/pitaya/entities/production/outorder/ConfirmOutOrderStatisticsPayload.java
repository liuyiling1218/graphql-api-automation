package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class ConfirmOutOrderStatisticsPayload {
    /**
     *
     */
    private Integer commodityCount;
    /**
     *
     */
    private Integer outOrderFinishCount;
    /**
     *
     */
    private Integer outOrderUnFinishCount;
}