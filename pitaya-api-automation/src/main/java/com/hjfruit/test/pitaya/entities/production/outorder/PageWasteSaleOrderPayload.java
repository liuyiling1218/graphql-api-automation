package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageWasteSaleOrderPayload {
    /**
     * 销售订单列表
     */
    private List<WasteSaleOrder> records;
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