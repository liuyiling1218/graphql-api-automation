package com.hjfruit.test.pitaya.entities.statistics;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;
/**
 * 
 */
@Data
public class OverviewStatusInput{
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