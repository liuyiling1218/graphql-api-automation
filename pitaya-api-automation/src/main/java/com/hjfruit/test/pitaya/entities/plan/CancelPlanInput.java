package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 取消生产计划入参
 */
@Data
public class CancelPlanInput {
    /**
     * 计划id
     */
    @Needed
    private String planId;
    /**
     * 计划文字描述
     */
    @Needed
    private String planLogDescription;
}