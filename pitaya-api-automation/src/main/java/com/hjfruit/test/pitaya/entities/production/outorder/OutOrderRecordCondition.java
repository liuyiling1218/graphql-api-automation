package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 * 出库记录列表条件（出库记录）
 */
@Data
public class OutOrderRecordCondition {
    /**
     * 出库时间
     */
    private String outOrderTime;
    /**
     * 仓库Id
     */
    private Integer warehouseId;
    /**
     * 出库类型Id
     */
    private Integer outOrderTypeId;
    /**
     * 订单号/客户（模糊查询）
     */
    private String keyword;
}