package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDamagedOrderItemInput {
    /**
     *
     */
    @Needed
    private String batchId;
    /**
     * 商品skuID
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 小单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 大单位数量
     */
    private BigDecimal totalQuantity;
    /**
     * 报损原因
     */
    @Needed
    private String damageReason;
    /**
     * 拍照记录
     */
    @Needed
    private List<String> photos;
}