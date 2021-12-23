package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class GetTransferOutOrderStatusPayload {
    /**
     * 待提交
     */
    private Integer toSubmit;
    /**
     * 待处理
     */
    private Integer toProcess;
}