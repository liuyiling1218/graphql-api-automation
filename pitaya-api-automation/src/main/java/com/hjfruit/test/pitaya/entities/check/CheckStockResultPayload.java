package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

/**
 *
 */
@Data
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
    private Integer checkId;
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