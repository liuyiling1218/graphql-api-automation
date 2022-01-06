package com.hjfruit.test.pitaya.entities.production.purchasereturn.type;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class PagePurchaseReturnPayload {
    /**
     * 销售订单列表
     */
    private List<PagePurchaseReturnRecordPayload> records;
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