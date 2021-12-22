package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class OutOrderPagePayload {
    /**
     * 销售订单列表
     */
    private List<OutOrderPayload> records;
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