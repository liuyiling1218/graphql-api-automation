package com.hjfruit.test.pitaya.app.entities.statistics.api;

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
public class GetProductionInput {
    /**
     *
     */
    @Needed
    private Long date;
}