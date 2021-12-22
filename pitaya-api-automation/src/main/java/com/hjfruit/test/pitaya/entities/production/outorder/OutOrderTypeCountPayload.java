package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class OutOrderTypeCountPayload {
    /**
     * 原料领料记录条数
     */
    private Long rawMaterial;
    /**
     * 辅料领料记录条数
     */
    private Long subMaterial;
    /**
     * 成品销售记录条数
     */
    private Long finishedProduct;
    /**
     * 次品出库记录条数
     */
    private Long defectiveProduct;
    /**
     * 半成品出库记录条数
     */
    private Long semiFinishedProduct;
    /**
     * 退货品
     */
    private Long refund;
    /**
     * 周转狂
     */
    private Long basket;
}