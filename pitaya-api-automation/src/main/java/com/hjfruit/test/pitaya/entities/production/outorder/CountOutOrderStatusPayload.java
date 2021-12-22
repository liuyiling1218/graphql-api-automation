package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class CountOutOrderStatusPayload {
    /**
     * 待提交
     */
    private Integer toSubmit;
    /**
     * 待审核
     */
    private Integer toAudit;
    /**
     * 待出库
     */
    private Integer toOutbound;
    /**
     * 已完成
     */
    private Integer finished;
    /**
     * 已取消
     */
    private Integer canceled;
}