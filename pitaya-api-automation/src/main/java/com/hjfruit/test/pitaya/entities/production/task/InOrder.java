package com.hjfruit.test.pitaya.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InOrder {
    /**
     * 生产任务id
     */
    @Needed
    private String taskId;
    /**
     * 商品类型id
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 出库订单类型
     */
    @Needed
    private Integer inOrderType;
    /**
     * 备注信息
     */
    private String inOrderDescription;
    /**
     *
     */
    @Needed
    private List<InOrderItem> inOrderItem;
}