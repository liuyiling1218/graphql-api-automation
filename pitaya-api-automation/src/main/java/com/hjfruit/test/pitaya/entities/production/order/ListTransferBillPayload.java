package com.hjfruit.test.pitaya.entities.production.order;

import com.hjfruit.test.pitaya.entities.production.inorder.TransferBillPayload;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ListTransferBillPayload {
    /**
     * 采购订单列表
     */
    private List<TransferBillPayload> records;
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