package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CreateDefectiveSaleOrderInput {
    /**
     *
     */
    private Integer warehouseId;
    /**
     *
     */
    private Long saleTime;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    @Needed
    private List<CreateDefectiveItemInput> defectiveItems;
}