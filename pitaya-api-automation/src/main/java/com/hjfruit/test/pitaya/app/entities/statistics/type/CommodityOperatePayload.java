package com.hjfruit.test.pitaya.app.entities.statistics.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品操作
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommodityOperatePayload {
    /**
     *
     */
    private Integer rawMaterial;
    /**
     *
     */
    private Integer assist;
    /**
     *
     */
    private Integer product;
    /**
     *
     */
    private Integer halfProduct;
    /**
     *
     */
    private Integer defective;
    /**
     *
     */
    private Integer _return;
    /**
     *
     */
    private Integer box;
}