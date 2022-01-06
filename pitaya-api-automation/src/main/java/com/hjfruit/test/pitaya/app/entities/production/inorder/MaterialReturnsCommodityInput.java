package com.hjfruit.test.pitaya.app.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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