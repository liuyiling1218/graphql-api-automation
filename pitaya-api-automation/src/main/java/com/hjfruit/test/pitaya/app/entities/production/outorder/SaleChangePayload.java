package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleChangePayload {
    /**
     *
     */
    private String changeId;
    /**
     * 销售单id
     */
    private String outOrderId;
    /**
     * 销售单明细id
     */
    private String outOrderItemId;
    /**
     * skuId
     */
    private Integer commoditySkuId;
    /**
     * 计划id
     */
    private String planId;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 销售变更数量
     */
    private Integer saleChangeQuantity;
    /**
     * 生产负责人变更数量
     */
    private Integer planChangeQuantity;
    /**
     * 1 增加 2 减少
     */
    private Integer changeType;
    /**
     * 变更描述
     */
    private String changeRemark;
    /**
     * 10 生产负责人待确认  20 生产负责人已忽略  30 生产负责人已处理  40 生产组长已处理
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人
     */
    private Integer updateBy;
}