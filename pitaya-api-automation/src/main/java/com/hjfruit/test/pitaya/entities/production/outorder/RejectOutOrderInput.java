package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 * 驳回出库审核订单
 */
@Data
public class RejectOutOrderInput {
    /**
     *
     */
    private String outOrderId;
    /**
     *
     */
    private String rejectDescription;
}