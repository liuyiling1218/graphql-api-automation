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
public class ListAcquireFilter {
    /**
     * 订单起始时间
     */
    private Long startTime;
    /**
     * 订单结束时间
     */
    private Long endTime;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 订单状态（全部，10待提交，20待入库 ，30已完成，40已取消）
     */
    private Integer applyStatus;
    /**
     * 查询关键字（订单号/客户，模糊查询）
     */
    private String keyword;
}