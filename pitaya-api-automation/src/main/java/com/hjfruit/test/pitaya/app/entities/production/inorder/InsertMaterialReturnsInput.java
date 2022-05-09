package com.hjfruit.test.pitaya.app.entities.production.inorder;

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