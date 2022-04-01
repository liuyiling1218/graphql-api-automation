package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PitayaPageCommodityPayload {
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Long totalRecords;
    /**
     *
     */
    private List<PitayaListCommodityPayLoad> records;
}