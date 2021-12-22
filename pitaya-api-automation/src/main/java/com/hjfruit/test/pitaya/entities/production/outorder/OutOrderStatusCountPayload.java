package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class OutOrderStatusCountPayload {
    /**
     * 待提交
     */
    private Integer toSubmit;
    /**
     * 待审核
     */
    private Integer toAudit;
    /**
     * 生产中
     */
    private Integer producing;
    /**
     * 待出库
     */
    private Integer toOutbound;
    /**
     * 已完成
     */
    private Integer finished;
}