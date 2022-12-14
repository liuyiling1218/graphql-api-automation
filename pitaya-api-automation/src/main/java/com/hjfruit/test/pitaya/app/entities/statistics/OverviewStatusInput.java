package com.hjfruit.test.pitaya.app.entities.statistics;

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
public class OverviewStatusInput {
    /**
     * 时间
     */
    @Needed
    private Long planDate;
    /**
     * 类型
     */
    private Integer createType;
}