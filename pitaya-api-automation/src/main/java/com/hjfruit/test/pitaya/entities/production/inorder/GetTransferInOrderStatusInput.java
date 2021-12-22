package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class GetTransferInOrderStatusInput {
    /**
     * 订单起始时间
     */
    @Needed
    private Long startTime;
    /**
     * 订单结束时间
     */
    @Needed
    private Long endTime;
    /**
     * 入库类型
     */
    @Needed
    private Integer inOrderTypeId;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 10跨区域 20跨系统
     */
    private Integer transferType;
}