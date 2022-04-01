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