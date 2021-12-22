package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdateProductionPlanInput {
    /**
     *
     */
    @Needed
    private String planId;
    /**
     *
     */
    @Needed
    private Long planStartTime;
    /**
     *
     */
    @Needed
    private Long planEndTime;
    /**
     *
     */
    @Needed
    private String planDescription;
    /**
     *
     */
    @Needed
    private List<UpdatePlanTaskInput> updatePlanTaskInput;
}