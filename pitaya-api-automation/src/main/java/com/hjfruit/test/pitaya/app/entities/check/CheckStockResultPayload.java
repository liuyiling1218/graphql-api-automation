package com.hjfruit.test.pitaya.app.entities.check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckStockResultPayload {
    /**
     * checkRecordId
     */
    private Integer checkRecordId;
    /**
     * 入库数量
     */
    private Integer checkInNum;
    /**
     * 出库数量
     */
    private Integer checkOutNum;
    /**
     *
     */
    private String checkId;
    /**
     *
     */
    private String outStockCode;
    /**
     *
     */
    private String outStockRecordId;
    /**
     *
     */
    private String inStockCode;
    /**
     *
     */
    private String inStockRecordId;
}