package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageNoCommodityPayload {
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
    private List<NoCommodityPayload> records;
}