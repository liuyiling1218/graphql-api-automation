package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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