package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class CancelInOrderInput {
    /**
     *
     */
    @Needed
    private String inOrderId;
    /**
     *
     */
    @Needed
    private String inOrderDescription;
}