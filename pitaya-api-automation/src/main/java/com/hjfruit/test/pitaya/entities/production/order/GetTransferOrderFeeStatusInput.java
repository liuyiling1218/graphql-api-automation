package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class GetTransferOrderFeeStatusInput {
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
     * 调拨类型（10 仓库间调拨，20 跨组织调拨，30库存退货，40库存借调）
     */
    private List<Integer> transferType;
    /**
     * 关键字查询
     */
    private String keyword;
}