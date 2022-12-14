package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 入库明细
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InOrderItem {
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
     * 出库库存记录明细id
     */
    private String outStockRecordItemId;
    /**
     * 单位类型数量（例：kg，个）
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     * 总计类型数量（例：件）
     */
    @Needed
    private BigDecimal totalQuantity;
}