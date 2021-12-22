package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

/**
 * 入库记录列表条件（入库记录）
 */
@Data
public class InOrderRecordFilter {
    /**
     * 入库时间
     */
    private Long inOrderTime;
    /**
     * 仓库Id（空为全部）
     */
    private Integer warehouseId;
    /**
     * 入库类型Id（可空）
     */
    private Integer inOrderTypeId;
    /**
     * 订单号/客户（模糊查询）
     */
    private String keyword;
}