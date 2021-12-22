package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 入库明细
 */
@Data
public class InOrderItemUpdate {
    /**
     * 入库明细id
     */
    private String inOrderItemId;
    /**
     * 商品sku id
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 批次id
     */
    private Integer batchId;
    /**
     * 单位类型数量（例：kg，个）
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     * 总计类型数量（例：件）
     */
    private BigDecimal totalQuantity;
}