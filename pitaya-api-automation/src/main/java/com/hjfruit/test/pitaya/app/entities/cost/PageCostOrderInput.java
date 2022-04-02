package com.hjfruit.test.pitaya.app.entities.cost;

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
public class PageCostOrderInput {
    /**
     * 开始时间
     */
    private Long startDate;
    /**
     * 结束时间
     */
    private Long endDate;
    /**
     * 订单状态 10待确认 20待提交 30待业务审核 40 待财务审核 50已完成
     */
    private List<Integer> status;
    /**
     * 货品类型
     */
    private Integer commodityType;
    /**
     * 查询类型 10采购费用单 20采购费用单审核列表
     */
    private Integer queryType;
}