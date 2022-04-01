package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品管理列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageCommodityInput {
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