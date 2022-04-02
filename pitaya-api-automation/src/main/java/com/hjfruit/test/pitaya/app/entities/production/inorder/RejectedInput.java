package com.hjfruit.test.pitaya.app.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 驳回入库审核订单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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