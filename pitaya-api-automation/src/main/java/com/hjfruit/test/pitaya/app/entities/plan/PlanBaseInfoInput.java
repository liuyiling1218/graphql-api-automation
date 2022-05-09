package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanBaseInfoInput {
    /**
     * 计划id
     */
    @Needed
    private String planId;
    /**
     * 计划开始时间
     */
    @Needed
    private Long planStartTime;
    /**
     * 计划结束时间
     */
    @Needed
    private Long planEndTime;
    /**
     * 备注
     */
    private String planDescription;
}