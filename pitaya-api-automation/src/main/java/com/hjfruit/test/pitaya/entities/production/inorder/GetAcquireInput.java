package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class GetAcquireInput {
    /**
     *
     */
    @Needed
    private String applyId;
}