package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class ListTransferOutOrderInput {
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
    private Integer commodityTypeId;
    /**
     * 出库订单状态 （全部，10待提交，20待处理 ，30已完成）
     */
    private Integer orderStatus;
    /**
     * 关键字搜索
     */
    private String keyword;
    /**
     * 出库类型
     */
    private Integer outOrderTypeId;
    /**
     * 10跨区域 20跨系统
     */
    private Integer transferType;
}