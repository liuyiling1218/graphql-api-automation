package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 入库记录列表条件（入库记录）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InOrderRecordFilter {
    /**
     * 入库时间
     */
    private Long inOrderTime;
    /**
     *
     */
    private Integer customerType;
    /**
     *
     */
    private Integer customerId;
    /**
     * 入库类型Id（可空）
     */
    private Integer inOrderTypeId;
    /**
     * 订单号/商品名称（模糊查询）
     */
    private String keyword;
}