package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class GetTransferOutOrderStatusInput {
    /**
     * 订单起始时间
     */
    private Long startTime;
    /**
     * 订单结束时间
     */
    private Long endTime;
    /**
     * 商品类型
     */
    private List<Integer> commodityType;
    /**
     * 10跨区域 20跨系统
     */
    private List<Integer> transferType;
    /**
     * 关键字查询
     */
    private String keyword;
}