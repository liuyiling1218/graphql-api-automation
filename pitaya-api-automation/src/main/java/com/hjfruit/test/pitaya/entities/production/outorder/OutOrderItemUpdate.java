package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class OutOrderItemUpdate {
    /**
     * 商品sku id
     */
    @Needed
    private Integer commoditySkuId;
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