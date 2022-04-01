package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

/**
 * 商品管理列表未添加商品列表
 */
@Data
public class PitayaPageNoCommodityInput {
    /**
     * 商品类型
     */
    private Integer typeId;
    /**
     * 品类
     */
    private Integer categoryId;
    /**
     * 品种
     */
    private Integer varietyId;
    /**
     * 产地
     */
    private Integer originId;
}