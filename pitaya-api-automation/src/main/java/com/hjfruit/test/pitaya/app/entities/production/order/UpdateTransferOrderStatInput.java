package com.hjfruit.test.pitaya.app.entities.production.order;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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