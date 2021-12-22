package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ModifyOtherInOrderInput {
    /**
     * 入库订单Id
     */
    @Needed
    private String inOrderId;
    /**
     * 仓库名称
     */
    @Needed
    private Integer warehouseId;
    /**
     * 供应商Id
     */
    private Integer supplierId;
    /**
     * 客户类型Id
     */
    private Integer customerTypeId;
    /**
     * 客户Id
     */
    private Integer customerId;
    /**
     * 订单备注
     */
    private String inOrderDescription;
    /**
     * 商品信息
     */
    @Needed
    private List<CreateOtherOrderItemInput> commodities;
}