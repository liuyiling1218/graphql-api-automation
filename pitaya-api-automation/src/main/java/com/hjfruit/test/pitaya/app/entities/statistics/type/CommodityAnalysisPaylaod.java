package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品分析
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommodityAnalysisPaylaod {
    /**
     *
     */
    private Integer commoditySkuTotal;
    /**
     *
     */
    private BigDecimal completed;
    /**
     *
     */
    private BigDecimal undone;
    /**
     *
     */
    private List<ChannelStatisticsPayload> channelStatistics;
}