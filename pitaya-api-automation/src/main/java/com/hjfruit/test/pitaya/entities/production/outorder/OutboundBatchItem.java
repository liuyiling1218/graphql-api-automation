package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
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