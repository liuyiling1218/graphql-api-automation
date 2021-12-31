package com.hjfruit.test.pitaya.entities.production.order;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class UpdateTransferOrderStatInput {
    /**
     *
     */
    @Needed
    private String flowId;
    /**
     *
     */
    private OrderOperation orderOperation;
    /**
     *
     */
    private String remark;
}