package com.hjfruit.test.pitaya.app.entities.production.order;

import com.hjfruit.test.pitaya.app.entities.production.inorder.TransferBillPayload;
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