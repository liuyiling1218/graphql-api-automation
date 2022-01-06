package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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