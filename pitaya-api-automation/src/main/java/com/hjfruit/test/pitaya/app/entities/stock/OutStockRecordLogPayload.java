package com.hjfruit.test.pitaya.app.entities.stock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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