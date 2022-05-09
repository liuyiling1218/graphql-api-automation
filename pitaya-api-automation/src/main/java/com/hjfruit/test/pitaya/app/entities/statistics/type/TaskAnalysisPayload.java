package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 任务分析
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskAnalysisPayload {
    /**
     *
     */
    private Integer totalTask;
    /**
     *
     */
    private List<ChannelStatisticsPayload> channelStatistics;
}