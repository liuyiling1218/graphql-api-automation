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
public class ListTransferOrderInput {
    /**
     * 订单起始时间
     */
    private Long startTime;
    /**
     * 订单结束时间
     */
    private Long endTime;
    /**
     * 调拨订单状态
     */
    private List<Integer> flowStatus;
    /**
     * 查询关键字（调拨组织/商品名称，模糊查询）
     */
    private String keyword;
    /**
     * 商品类型
     */
    private List<Integer> commodityType;
    /**
     * 调拨类型（10 仓库间调拨，20 跨组织调拨，30库存退货，40库存借调）
     */
    private List<Integer> transferType;
}