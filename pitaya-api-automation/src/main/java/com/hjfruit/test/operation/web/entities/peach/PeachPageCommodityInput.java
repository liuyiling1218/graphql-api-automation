package com.hjfruit.test.operation.web.entities.peach;

import lombok.Data;

/**
 * 商品管理列表
 */
@Data
public class PeachPageCommodityInput {
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
}