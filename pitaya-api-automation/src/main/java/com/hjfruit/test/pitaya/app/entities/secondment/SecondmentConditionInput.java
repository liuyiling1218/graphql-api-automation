package com.hjfruit.test.pitaya.app.entities.secondment;

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
public class SecondmentConditionInput {
    /**
     * 仓库id
     */
    @Needed
    private String warehouseId;
    /**
     * 商品分类
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 归属id
     */
    @Needed
    private Integer belongId;
    /**
     * 归属类型
     */
    @Needed
    private Integer belongType;
}