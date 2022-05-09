package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
    /**
     * 调拨去向筛选 10 分拣仓-分拣仓 20批发-分拣仓 30分拣仓-批发
     */
    private Integer direction;
}