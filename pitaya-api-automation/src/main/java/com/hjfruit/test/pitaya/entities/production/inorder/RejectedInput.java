package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 驳回入库审核订单
 */
@Data
public class RejectedInput {
    /**
     *
     */
    @Needed
    private String inOrderId;
    /**
     * 驳回原因
     */
    @Needed
    private String rejectedDescription;
}