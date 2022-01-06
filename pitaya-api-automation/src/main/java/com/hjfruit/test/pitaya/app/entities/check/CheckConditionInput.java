package com.hjfruit.test.pitaya.app.entities.check;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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