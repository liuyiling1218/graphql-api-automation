package com.hjfruit.test.pitaya.app.entities.plan;

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