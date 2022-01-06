package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分状态统计入参信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseReturnStatusCountInput {
    /**
     * 采购退货时间
     */
    @Needed
    private Long purchaseReturnTime;
}