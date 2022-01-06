package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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