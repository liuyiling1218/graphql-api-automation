package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class CancelInOrderInput {
    /**
     *
     */
    @Needed
    private String inOrderId;
    /**
     *
     */
    private String inOrderDescription;
}