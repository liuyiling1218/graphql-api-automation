package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type;

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