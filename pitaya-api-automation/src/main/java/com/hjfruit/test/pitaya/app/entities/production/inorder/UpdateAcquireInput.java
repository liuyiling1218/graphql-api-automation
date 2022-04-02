package com.hjfruit.test.pitaya.app.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAcquireInput {
    /**
     * 入库订单Id
     */
    @Needed
    private String applyId;
    /**
     * 仓库名称
     */
    @Needed
    private String warehouseId;
    /**
     * 供应商Id
     */
    @Needed
    private Integer supplierId;
    /**
     * 客户类型Id
     */
    private Integer belongType;
    /**
     * 客户Id
     */
    private Integer belongId;
    /**
     * 订单备注
     */
    private String note;
    /**
     * 商品信息
     */
    @Needed
    @NotEmpty
    private List<CreateAcquireItemInput> commodities;
    /**
     * 费用信息
     */
    private List<CreateCostInput> costs;
}