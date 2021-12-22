package com.hjfruit.test.pitaya.entities.stock;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageOutOrderRecordPayload {
    /**
     *
     */
    private List<OutStockRecordQueryPayload> records;
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
}