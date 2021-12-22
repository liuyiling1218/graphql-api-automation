package com.hjfruit.test.pitaya.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CreateDamagedOrderItemInput {
    /**
     *
     */
    @Needed
    private Integer batchId;
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