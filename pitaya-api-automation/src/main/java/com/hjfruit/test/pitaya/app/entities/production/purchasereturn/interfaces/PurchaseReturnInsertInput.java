package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 采购退货新增
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseReturnInsertInput {
    /**
     * 采购订单Id
     */
    @Needed
    private String purchaseId;
    /**
     * 备注
     */
    private String note;
    /**
     * 商品信息
     */
    @Needed
    private List<PurchaseReturnItemInput> commodities;
}