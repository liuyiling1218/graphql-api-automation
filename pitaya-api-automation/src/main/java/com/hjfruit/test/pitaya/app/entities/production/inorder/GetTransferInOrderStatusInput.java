package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class GetTransferInOrderStatusInput {
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