package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 采购记录条数
 */
@Data
public class CountAcquireFilter {
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
     * 商品类型
     */
    @Needed
    private Integer commodityType;
}