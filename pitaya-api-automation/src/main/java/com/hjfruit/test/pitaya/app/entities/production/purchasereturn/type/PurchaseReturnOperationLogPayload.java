package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type;

import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.common.PurchaseReturnStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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