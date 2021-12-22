package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class PlanPageResult {
    /**
     *
     */
    private List<ProductionPlanPayload> records;
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