package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 记录条数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountAcquirePayload {
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