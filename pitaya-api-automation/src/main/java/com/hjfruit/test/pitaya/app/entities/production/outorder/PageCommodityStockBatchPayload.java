package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.NotEmpty;
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
public class PageCommodityStockBatchPayload {
    /**
     *
     */
    @Needed
    private Integer pageCurrent;
    /**
     *
     */
    @Needed
    private Integer pageSize;
    /**
     *
     */
    @Needed
    private Long totalRecords;
    /**
     *
     */
    @NotEmpty
    private List<CommodityStockBatchPayload> records;
}