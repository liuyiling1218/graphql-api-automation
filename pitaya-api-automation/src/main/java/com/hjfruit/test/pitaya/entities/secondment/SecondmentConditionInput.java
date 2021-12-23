package com.hjfruit.test.pitaya.entities.secondment;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class SecondmentConditionInput {
    /**
     * 仓库id
     */
    @Needed
    private Integer warehouseId;
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