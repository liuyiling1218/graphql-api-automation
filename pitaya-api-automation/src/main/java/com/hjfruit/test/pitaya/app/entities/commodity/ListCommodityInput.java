package com.hjfruit.test.pitaya.app.entities.commodity;

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
public class ListCommodityInput {
    /**
     * 分类id
     */
    private Integer categoryId;
    /**
     * 是否需要有bom
     */
    private Boolean hasBom;
    /**
     * 商品类型 果品 辅料 周转筐 食品
     */
    private List<Integer> commodityTypeId;
    /**
     * 商品名称模糊查询
     */
    private String commodityName;
}