package com.hjfruit.test.pitaya.app.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 新增其他入库信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String warehouseId;
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