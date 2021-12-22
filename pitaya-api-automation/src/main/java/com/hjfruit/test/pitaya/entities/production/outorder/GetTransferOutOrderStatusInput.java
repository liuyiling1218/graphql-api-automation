package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class GetTransferOutOrderStatusInput {
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
    private Integer outOrderTypeId;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 10跨区域 20跨系统
     */
    private Integer transferType;
}