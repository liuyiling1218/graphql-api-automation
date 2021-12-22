package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 * 出库条数
 */
@Data
public class CountOutOrder {
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
}