package com.hjfruit.test.pitaya.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
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