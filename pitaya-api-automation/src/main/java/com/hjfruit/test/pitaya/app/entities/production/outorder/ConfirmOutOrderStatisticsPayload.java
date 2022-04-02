package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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