package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdateDamageOutOrderInput {
    /**
     * 出库订单Id
     */
    @Needed
    private String outOrderId;
    /**
     * 仓库名称
     */
    @Needed
    private Integer warehouseId;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 商品信息
     */
    @Needed
    private List<CreateDamageOutOrderItemInput> commodityList;
}