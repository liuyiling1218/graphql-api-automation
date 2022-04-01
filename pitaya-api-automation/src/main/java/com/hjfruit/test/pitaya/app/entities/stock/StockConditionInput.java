package com.hjfruit.test.pitaya.app.entities.stock;

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
public class StockConditionInput {
    /**
     * 查询参数(商品名称批次号)
     */
    private String keyword;
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     * 商品分类 果品 辅料 周转筐
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     * 归属id
     */
    private Integer belongId;
    /**
     * 具体商品类型(只针对于果品库存的类型需要传入数组参数) 原料 成品 半成品 次品 退货品
     */
    private List<Integer> commodityType;
}