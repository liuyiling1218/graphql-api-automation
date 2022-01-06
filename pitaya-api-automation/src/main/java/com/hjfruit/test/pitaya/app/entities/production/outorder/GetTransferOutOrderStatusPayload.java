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
public class GetTransferOutOrderStatusPayload {
    /**
     * 待提交
     */
    private Long toSubmit;
    /**
     * 待处理
     */
    private Long toProcess;
}