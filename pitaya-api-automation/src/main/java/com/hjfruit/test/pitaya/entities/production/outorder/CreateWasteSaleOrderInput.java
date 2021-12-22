package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CreateWasteSaleOrderInput {
    /**
     *
     */
    @Needed
    private Integer warehouseId;
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