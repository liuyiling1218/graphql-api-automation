package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 *
 */
@Data
public class Warehousing {
    /**
     *
     */
    private Integer finishedProductUnFinish;
    /**
     *
     */
    private Integer finishedProduct;
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
    private Integer defectiveUnFinish;
    /**
     *
     */
    private Integer defective;
    /**
     *
     */
    private Integer undone;
}