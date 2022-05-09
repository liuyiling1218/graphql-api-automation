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
    /**
     * 客户所属渠道id
     */
    private Integer channelId;
}