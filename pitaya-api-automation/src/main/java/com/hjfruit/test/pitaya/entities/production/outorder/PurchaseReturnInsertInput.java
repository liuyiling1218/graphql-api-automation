package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 采购退货新增
 */
@Data
public class PurchaseReturnInsertInput {
    /**
     * 采购订单Id
     */
    @Needed
    private String inOrderId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 商品信息
     */
    @Needed
    private List<PurchaseReturnItemInput> commodities;
}