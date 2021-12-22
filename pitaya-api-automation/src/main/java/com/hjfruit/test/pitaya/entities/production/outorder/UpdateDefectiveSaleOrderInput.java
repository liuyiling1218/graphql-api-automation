package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;
/**
 * 
 */
@Data
public class UpdateDefectiveSaleOrderInput{
    /**
     * 
     */
    private String outOrderId;
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