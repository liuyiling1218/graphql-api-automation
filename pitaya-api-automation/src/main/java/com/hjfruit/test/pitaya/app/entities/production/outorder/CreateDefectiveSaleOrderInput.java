package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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