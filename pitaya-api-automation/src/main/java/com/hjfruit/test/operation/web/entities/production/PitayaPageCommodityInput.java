package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * 商品管理列表
 */
@Data
public class PitayaPageCommodityInput {
    /**
     * 商品类型
     */
    private Integer typeId;
    /**
     * 品类id
     */
    private Integer categoryId;
    /**
     * spu名称
     */
    private String commodityName;
    /**
     * 排除商品id
     */
    private List<Integer> excludeCommodityIds;
    /**
     * 状态
     */
    private Integer status;
}