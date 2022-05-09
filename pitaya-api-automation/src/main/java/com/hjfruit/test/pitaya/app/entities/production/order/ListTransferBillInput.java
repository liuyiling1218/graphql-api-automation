package com.hjfruit.test.pitaya.app.entities.production.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private List<Integer> billStatus;
    /**
     * 10 调拨出库 20 调拨入库
     */
    private Integer flowType;
}