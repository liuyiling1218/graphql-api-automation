package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 领料申请保存提交参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutOrder {
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
     * 出库订单类型，10：原料领料、20：辅料领料
     */
    @Needed
    private Integer outOrderType;
    /**
     * 备注信息
     */
    private String outOrderDescription;
    /**
     *
     */
    @Needed
    private List<OutOrderItem> outOrderItem;
}