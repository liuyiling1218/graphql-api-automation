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
public class TaskInsertInput {
    /**
     * 生产组长id
     */
    @Needed
    private Integer leaderId;
    /**
     * 生产线
     */
    @Needed
    private Integer line;
    /**
     *
     */
    @Needed
    private List<CommodityInput> commodities;
}