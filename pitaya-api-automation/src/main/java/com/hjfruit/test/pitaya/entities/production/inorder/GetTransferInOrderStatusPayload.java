package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

/**
 *
 */
@Data
public class GetTransferInOrderStatusPayload {
    /**
     * 待提交
     */
    private Integer toSubmit;
    /**
     * 待处理
     */
    private Integer toProcess;
}