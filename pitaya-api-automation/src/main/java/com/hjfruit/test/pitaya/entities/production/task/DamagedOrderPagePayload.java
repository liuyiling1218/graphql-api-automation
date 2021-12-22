package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class DamagedOrderPagePayload {
    /**
     * 销售订单列表
     */
    private List<DamagedOrderPayload> records;
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