package com.hjfruit.test.pitaya.entities.label;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ListRecommendLabelPayload {
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Long totalRecords;
    /**
     *
     */
    private List<RecommendLabelPayload> records;
}