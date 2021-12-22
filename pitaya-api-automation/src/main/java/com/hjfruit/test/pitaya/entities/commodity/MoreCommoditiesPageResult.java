package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class MoreCommoditiesPageResult {
    /**
     *
     */
    private List<TaskAcquireMaterialCommodityPayload> records;
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
}