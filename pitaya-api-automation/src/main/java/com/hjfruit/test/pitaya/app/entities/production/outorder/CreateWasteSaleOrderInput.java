package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
public class CreateWasteSaleOrderInput {
    /**
     *
     */
    @Needed
    private String warehouseId;
    /**
     *
     */
    private Long saleTime;
    /**
     *
     */
    @Needed
    private String spu;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private List<String> photos;
    /**
     *
     */
    private BigDecimal totalSalePrice;
}