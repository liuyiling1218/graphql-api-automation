package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class SpecsInput {
    /**
     * 商品类型id
     */
    private Integer typeId;
    /**
     * 商品品类id
     */
    private Integer categoryId;
    /**
     * 品种id
     */
    private Integer varietyId;
    /**
     * 产地id
     */
    private Integer origin;
    /**
     * 商品id
     */
    private Integer spuId;
}