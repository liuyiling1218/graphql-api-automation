package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 出库条数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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