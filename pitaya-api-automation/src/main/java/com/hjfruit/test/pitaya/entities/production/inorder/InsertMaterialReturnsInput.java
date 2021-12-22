package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InsertMaterialReturnsInput {
    /**
     *
     */
    @Needed
    private String taskId;
    /**
     *
     */
    @Needed
    private Integer commodityType;
    /**
     *
     */
    private String inOrderDescription;
    /**
     *
     */
    @Needed
    private List<MaterialReturnsCommodityInput> materialReturnsCommodityInput;
}