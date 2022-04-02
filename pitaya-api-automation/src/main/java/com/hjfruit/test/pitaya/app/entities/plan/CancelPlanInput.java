package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 取消生产计划入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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