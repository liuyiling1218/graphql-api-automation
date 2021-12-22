package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class CountOutOrderStatusInput {
    /**
     * 销售时间
     */
    private Long saleTime;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     *
     */
    private Long startTime;
    /**
     *
     */
    private Long endTime;
    /**
     * 出库订单状态，默认待提交，10：待提交、15 待审核 20：待出库、30：部分出库、40：已完成、50：已取消
     */
    private Integer orderStatus;
    /**
     * 出库订单类型，10：原料领料、20辅料领料 30 成品销售 40 次品 50 半成品
     */
    private Integer outOrderType;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 任务id
     */
    private String taskId;
}