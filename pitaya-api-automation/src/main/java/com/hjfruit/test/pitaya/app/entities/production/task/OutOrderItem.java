package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 领料申请明细
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutOrderItem {
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