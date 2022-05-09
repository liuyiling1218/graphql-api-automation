package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 驳回出库审核订单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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