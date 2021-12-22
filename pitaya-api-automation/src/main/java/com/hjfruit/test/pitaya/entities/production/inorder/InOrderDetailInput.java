package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class InOrderDetailInput {
    /**
     *
     */
    @Needed
    private String inOrderId;
    /**
     * 生产数据 10 黄龙数据 20
     */
    @Needed
    private Integer dataType;
}