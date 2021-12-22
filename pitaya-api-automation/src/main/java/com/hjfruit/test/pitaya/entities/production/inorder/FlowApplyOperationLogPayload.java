package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

/**
 *
 */
@Data
public class FlowApplyOperationLogPayload {
    /**
     * 状态
     */
    private Integer status;
    /**
     * 状态名字
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
     * 操作人信息
     */
    private String operationUserName;
}