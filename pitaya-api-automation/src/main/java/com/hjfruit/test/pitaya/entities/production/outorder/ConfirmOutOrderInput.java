package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 确认出库
 */
@Data
public class ConfirmOutOrderInput {
    /**
     * 出库订单Id
     */
    @Needed
    private String outOrderId;
    /**
     * 商品信息
     */
    @Needed
    private List<ConfirmOutOrderItem> items;
    /**
     * 出库备注
     */
    private String remark;
    /**
     *
     */
    private Float deliveryFee;
}