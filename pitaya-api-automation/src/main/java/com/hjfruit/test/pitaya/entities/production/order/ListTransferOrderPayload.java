package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class ListTransferOrderPayload {
    /**
     *
     */
    private List<TransferOrderPayload> records;
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