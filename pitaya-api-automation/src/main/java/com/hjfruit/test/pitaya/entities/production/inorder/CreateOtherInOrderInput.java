package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 新增采购信息
 */
@Data
public class CreateOtherInOrderInput {
    /**
     * 入库类型
     */
    @Needed
    private Integer inOrderTypeId;
    /**
     * 商品类型Id
     */
    @Needed
    private Integer commodityTypeId;
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