package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 *
 */
@Data
public class ReturnMaterial {
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
    private Integer accessoriesUnFinish;
    /**
     *
     */
    private Integer accessories;
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
    private Boolean noReturn;
}