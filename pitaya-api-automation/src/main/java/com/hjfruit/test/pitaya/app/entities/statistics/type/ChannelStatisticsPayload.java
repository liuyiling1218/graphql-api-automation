package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 渠道统计任务
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChannelStatisticsPayload {
    /**
     *
     */
    private String channelName;
    /**
     *
     */
    private BigDecimal expectNum;
    /**
     *
     */
    private BigDecimal completed;
    /**
     *
     */
    private BigDecimal undone;
}