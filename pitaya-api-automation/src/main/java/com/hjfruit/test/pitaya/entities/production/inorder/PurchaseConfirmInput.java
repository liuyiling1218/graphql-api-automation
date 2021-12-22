package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PurchaseConfirmInput {
    /**
     * 入库订单Id
     */
    @Needed
    private String inOrderId;
    /**
     * 本次入库操作备注信息
     */
    private String remark;
    /**
     * 入库商品信息
     */
    @Needed
    private List<PurchaseConfirmItemInput> items;
    /**
     *
     */
    private Integer belongType;
    /**
     *
     */
    private Integer belongId;
    /**
     * 采购入库类型
     */
    @Needed
    private Integer inOrderType;
}