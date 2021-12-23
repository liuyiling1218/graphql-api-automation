package com.hjfruit.test.pitaya.entities.statistics;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class PageOverviewInput {
    /**
     *
     */
    private Integer createType;
    /**
     *
     */
    @Needed
    private Long planDate;
    /**
     * 10待审核 30进行中 40已完成
     */
    private Integer planStatus;
}