package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class MaterialReturnsCommodityInput {
    /**
     *
     */
    @Needed
    private Integer commoditySkuId;
    /**
     *
     */
    @Needed
    private Integer totalQuantity;
    /**
     *
     */
    @Needed
    private BigDecimal unitQuantity;
    /**
     *
     */
    @Needed
    private Integer batchCode;
}