package com.hjfruit.test.pitaya.app.entities.stock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageStockBatchInput {
    /**
     *
     */
    private Integer commodityTypeId;
    /**
     * 仓库id
     */
    private String warehouseId;
    /**
     * 所属客户
     */
    private Integer customerId;
    /**
     * 所属客户类型
     */
    private Integer customerType;
    /**
     * 关键字查询 商品名称
     */
    private String keyword;
}