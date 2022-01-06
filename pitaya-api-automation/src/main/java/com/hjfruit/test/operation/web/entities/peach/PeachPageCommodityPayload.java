package com.hjfruit.test.operation.web.entities.peach;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PeachPageCommodityPayload {
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
    private List<PeachListCommodityPayLoad> records;
}