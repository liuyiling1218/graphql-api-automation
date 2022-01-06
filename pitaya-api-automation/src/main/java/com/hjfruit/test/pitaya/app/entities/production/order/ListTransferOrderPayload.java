package com.hjfruit.test.pitaya.app.entities.production.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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