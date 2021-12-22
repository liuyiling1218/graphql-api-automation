package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class ListTransferInOrderInput {
    /**
     * 订单起始时间
     */
    private Long startTime;
    /**
     * 订单结束时间
     */
    private Long endTime;
    /**
     * 入库类型
     */
    @Needed
    private Integer inOrderTypeId;
    /**
     * 订单状态（全部，10待提交，20待处理 ，30已完成）
     */
    private Integer orderStatus;
    /**
     * 查询关键字（调拨组织/商品名称，模糊查询）
     */
    private String keyword;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 10跨区域 20跨系统
     */
    private Integer transferType;
}