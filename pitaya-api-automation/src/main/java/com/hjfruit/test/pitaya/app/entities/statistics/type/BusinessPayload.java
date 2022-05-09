package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessPayload {
    /**
     *
     */
    private Integer channelId;
    /**
     *
     */
    private String channelName;
    /**
     *
     */
    private Integer platformNum;
    /**
     *
     */
    private BigDecimal expectNum;
    /**
     *
     */
    private BigDecimal completedNum;
    /**
     *
     */
    private BigDecimal finishDelivery;
    /**
     *
     */
    private BigDecimal realQuantity;
    /**
     *
     */
    private BigDecimal saleAmount;
}