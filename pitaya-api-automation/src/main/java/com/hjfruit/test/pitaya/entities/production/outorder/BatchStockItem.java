package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class BatchStockItem {
    /**
     * 批次Id
     */
    @Needed
    private Integer batchStockId;
    /**
     * 小单位数量
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     * 副单位数量
     */
    @Needed
    private BigDecimal totalQuantity;
}