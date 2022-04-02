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
public class OutboundBatchItem {
    /**
     * 小单位数量
     */
    private String unitQuantity;
    /**
     * 副单位数量
     */
    private String totalQuantity;
    /**
     * 批次号
     */
    private String batchCode;
}