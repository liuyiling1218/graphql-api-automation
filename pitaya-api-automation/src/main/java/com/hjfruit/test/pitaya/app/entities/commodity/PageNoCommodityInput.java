package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品管理列表未添加商品列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageNoCommodityInput {
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