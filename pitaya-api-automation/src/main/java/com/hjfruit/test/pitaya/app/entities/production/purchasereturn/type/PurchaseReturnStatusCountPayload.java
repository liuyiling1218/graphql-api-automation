package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分状态统计返回信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseReturnStatusCountPayload {
    /**
     * 待提交数量
     */
    private Integer unSubmitCount;
    /**
     * 待入库数量
     */
    private Integer unStorageCount;
    /**
     * 已完成数量
     */
    private Integer completeCount;
    /**
     * 已取消数量
     */
    private Integer cancelCount;
}