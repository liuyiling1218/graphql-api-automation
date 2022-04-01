package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品品类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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