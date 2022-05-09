package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageCommodityStockBatchInput {
    /**
     *
     */
    private Integer commodityTypeId;
    /**
     *
     */
    private String warehouseId;
    /**
     *
     */
    private Integer customerId;
    /**
     *
     */
    private Integer customerType;
    /**
     *
     */
    private String keyword;
}