package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.NotEmpty;
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
    @NotEmpty
    private List<String> photos;
}