package com.hjfruit.test.pitaya.app.entities.production.task;

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
public class CreateDamagedOrderInput {
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
     * 仓库id
     */
    @Needed
    private Integer warehouseId;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 任务id
     */
    @Needed
    private String taskId;
    /**
     * 商品信息
     */
    @Needed
    private List<CreateDamagedOrderItemInput> commodityList;
}