package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 销售列表条件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuerySaleOrderInput {
    /**
     * 销售时间
     */
    private Long saleTime;
    /**
     * 订单状态（10全部，20待提交，30待审核 ，40待出库，50已完成）
     */
    private Integer orderStatus;
    /**
     * 查询关键字（订单号/客户，模糊查询）
     */
    private String keyword;
}