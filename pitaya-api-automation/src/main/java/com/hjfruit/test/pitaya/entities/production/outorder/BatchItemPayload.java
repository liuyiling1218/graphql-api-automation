package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class BatchItemPayload {
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 小单位数量
     */
    private String unitQuantity;
    /**
     * 副单位数量
     */
    private String totalQuantity;
}