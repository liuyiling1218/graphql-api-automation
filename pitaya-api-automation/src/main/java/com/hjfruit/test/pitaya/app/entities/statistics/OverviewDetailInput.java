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
public class OverviewDetailInput {
    /**
     *
     */
    @Needed
    private String planId;
}