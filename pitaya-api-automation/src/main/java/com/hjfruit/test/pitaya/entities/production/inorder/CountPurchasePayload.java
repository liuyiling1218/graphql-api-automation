package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

/**
 * 记录条数
 */
@Data
public class CountPurchasePayload {
    /**
     * 待提交记录条数
     */
    private Long toSubmit;
    /**
     * 待入库记录条数
     */
    private Long toInbound;
    /**
     * 已完成记录条数
     */
    private Long finished;
    /**
     * 已取消记录条数
     */
    private Long canceled;
}