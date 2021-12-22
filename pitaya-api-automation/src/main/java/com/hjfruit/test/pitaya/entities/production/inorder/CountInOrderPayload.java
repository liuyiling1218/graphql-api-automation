package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

/**
 * 入库条数
 */
@Data
public class CountInOrderPayload {
    /**
     * 原料入库记录条数
     */
    private Long rawMaterial;
    /**
     * 辅料入库记录条数
     */
    private Long subMaterial;
    /**
     * 成品入库记录条数
     */
    private Long finishedProduct;
    /**
     * 次品入库记录条数
     */
    private Long defectiveProduct;
    /**
     * 半成品入库记录条数
     */
    private Long semiFinishedProduct;
    /**
     * 周转筐入库记录条数
     */
    private Long turnoverBasket;
    /**
     * 退货品入库记录条数
     */
    private Long returnProduct;
}