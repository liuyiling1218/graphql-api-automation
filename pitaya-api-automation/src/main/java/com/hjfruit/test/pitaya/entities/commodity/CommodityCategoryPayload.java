package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

/**
 * 商品品类实体
 */
@Data
public class CommodityCategoryPayload {
    /**
     * 品类id
     */
    private Integer categoryId;
    /**
     * 品类名称
     */
    private String categoryName;
}