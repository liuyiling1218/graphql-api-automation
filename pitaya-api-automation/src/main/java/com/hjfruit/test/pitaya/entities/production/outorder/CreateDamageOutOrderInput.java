package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 新增其他出库单
 */
@Data
public class CreateDamageOutOrderInput {
    /**
     * 商品类型
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 仓库id
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