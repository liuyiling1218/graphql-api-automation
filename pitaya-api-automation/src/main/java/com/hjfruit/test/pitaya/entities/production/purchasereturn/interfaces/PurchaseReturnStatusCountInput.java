package com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 分状态统计入参信息
 */
@Data
public class PurchaseReturnStatusCountInput {
    /**
     * 查询开始时间 传当天的时间段
     */
    @Needed
    private Long startTime;
    /**
     * 查询结束时间
     */
    @Needed
    private Long endTime;
}