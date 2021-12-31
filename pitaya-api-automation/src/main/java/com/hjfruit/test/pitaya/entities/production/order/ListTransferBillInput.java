package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ListTransferBillInput {
    /**
     * 开始日期
     */
    private Long startTime;
    /**
     * 结束日期
     */
    private Long endTime;
    /**
     * 商品类型
     */
    private List<Integer> commodityType;
    /**
     * 状态
     */
    private List<Integer> flowStatus;
    /**
     * 10 调拨出库 20 调拨入库
     */
    private List<Integer> flowType;
}