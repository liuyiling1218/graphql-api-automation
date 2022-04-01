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
public class ListSkuStockInput {
    /**
     *
     */
    private Integer commodityTypeId;
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     * 所属客户
     */
    private Integer customerId;
    /**
     * 所属客户类型
     */
    private Integer customerType;
    /**
     * 关键字查询
     */
    private String keyword;
}