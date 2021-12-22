package com.hjfruit.test.pitaya.entities.cost;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PageCostOrderInput {
    /**
     * 开始时间
     */
    private Long startDate;
    /**
     * 结束时间
     */
    private Long endDate;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 货品类型
     */
    private Integer commodityType;
    /**
     * 申请类型（10采购申请）
     */
    @Needed
    private Integer applyType;
}