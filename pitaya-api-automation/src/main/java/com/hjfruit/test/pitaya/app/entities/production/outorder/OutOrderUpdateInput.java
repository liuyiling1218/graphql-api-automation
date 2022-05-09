package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
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
public class OutOrderUpdateInput {
    /**
     * 出库订单id
     */
    @Needed
    private String outOrderId;
    /**
     * 备注信息
     */
    private String outOrderDescription;
    /**
     * 出库类型
     */
    @Needed
    private Integer outOrderType;
    /**
     * 商品类型
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 商品信息
     */
    @Needed
    private List<OutOrderItemUpdate> outOrderItem;
}