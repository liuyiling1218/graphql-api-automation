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