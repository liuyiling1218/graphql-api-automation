package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageOtherOutOrderInput {
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
     * 出库订单状态
     */
    private Integer outOrderStatus;
    /**
     * 关键字搜索
     */
    private String keyword;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 出库类型
     */
    private Integer outOrderTypeId;
}