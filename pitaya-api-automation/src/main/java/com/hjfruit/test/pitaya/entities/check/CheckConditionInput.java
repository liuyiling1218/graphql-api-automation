package com.hjfruit.test.pitaya.entities.check;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CheckConditionInput {
    /**
     * 仓库id
     */
    @Needed
    private Integer warehouseId;
    /**
     * 商品分类
     */
    private List<Integer> commodityTypeIds;
}