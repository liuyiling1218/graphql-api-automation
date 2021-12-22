package com.hjfruit.test.pitaya.entities.statistics;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;
/**
 * 
 */
@Data
public class OverviewDetailInput{
    /**
     * 
     */
    @Needed 
    private String planId;
}