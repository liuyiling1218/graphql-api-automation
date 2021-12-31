package com.hjfruit.test.pitaya.entities.production.purchasereturn.type;

import com.hjfruit.test.pitaya.entities.production.purchasereturn.common.PurchaseReturnStatus;
import lombok.Data;

/**
 *
 */
@Data
public class PurchaseReturnOperationLogPayload {
    /**
     * 状态
     */
    private PurchaseReturnStatus status;
    /**
     *
     */
    private String statusName;
    /**
     * 状态时间
     */
    private Long statusTime;
    /**
     * 操作人
     */
    private Integer operationUserId;
    /**
     *
     */
    private String operationUserName;
}