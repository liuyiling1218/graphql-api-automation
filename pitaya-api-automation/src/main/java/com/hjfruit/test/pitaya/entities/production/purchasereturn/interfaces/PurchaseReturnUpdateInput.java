package com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 采购退货修改
 */
@Data
public class PurchaseReturnUpdateInput {
    /**
     * 采购退货订单Id
     */
    @Needed
    private String purchaseReturnId;
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