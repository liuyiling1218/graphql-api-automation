package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 采购列表条件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseListFilter {
    /**
     * 订单起始时间
     */
    private Long startTime;
    /**
     * 订单结束时间
     */
    private Long endTime;
    /**
     * 入库类型
     */
    private Integer inOrderTypeId;
    /**
     * 订单状态（10全部，20待提交，30待入库 ，40已完成，50已取消）
     */
    private Integer orderStatus;
    /**
     * 查询关键字（订单号/客户，模糊查询）
     */
    private String keyword;
}