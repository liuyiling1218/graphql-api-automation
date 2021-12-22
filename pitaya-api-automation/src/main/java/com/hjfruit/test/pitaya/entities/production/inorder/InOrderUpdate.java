package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InOrderUpdate {
    /**
     * 生产订单id
     */
    @Needed
    private String inOrderId;
    /**
     * 商品类型id
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 入库类型
     */
    @Needed
    private Integer inOrderType;
    /**
     * 备注信息
     */
    private String inOrderDescription;
    /**
     * 商品item信息
     */
    @Needed
    private List<InOrderItemUpdate> inOrderItem;
}