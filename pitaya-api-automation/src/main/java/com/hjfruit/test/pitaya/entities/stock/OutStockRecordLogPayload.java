package com.hjfruit.test.pitaya.entities.stock;

import lombok.Data;

/**
 *
 */
@Data
public class OutStockRecordLogPayload {
    /**
     * 提交人员
     */
    private String submitUserName;
    /**
     * 提交时间
     */
    private Long submitTime;
    /**
     * 入库人员
     */
    private String putInUserName;
    /**
     * 入库时间
     */
    private Long putInTime;
}