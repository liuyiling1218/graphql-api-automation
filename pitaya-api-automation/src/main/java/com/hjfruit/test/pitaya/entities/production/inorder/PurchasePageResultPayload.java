package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class PurchasePageResultPayload {
    /**
     * 采购订单列表
     */
    private List<PurchaseOrderPayload> records;
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