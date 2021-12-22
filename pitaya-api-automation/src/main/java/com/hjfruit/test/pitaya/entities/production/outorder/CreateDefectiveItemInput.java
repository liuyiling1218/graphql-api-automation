package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CreateDefectiveItemInput {
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private BigDecimal saleQuantity;
    /**
     *
     */
    private BigDecimal saleTotalPrice;
    /**
     *
     */
    @Needed
    private List<String> photos;
}