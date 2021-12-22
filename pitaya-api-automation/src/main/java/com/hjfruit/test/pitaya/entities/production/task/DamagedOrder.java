package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 *
 */
@Data
public class DamagedOrder {
    /**
     *
     */
    private Integer rawMaterialUnFinish;
    /**
     *
     */
    private Integer rawMaterial;
    /**
     *
     */
    private Integer semiFinishedProductsUnFinish;
    /**
     *
     */
    private Integer semiFinishedProducts;
    /**
     *
     */
    private Integer returnedGoodsUnFinish;
    /**
     *
     */
    private Integer returnedGoods;
    /**
     *
     */
    private Integer undone;
    /**
     *
     */
    private Boolean noDamage;
}