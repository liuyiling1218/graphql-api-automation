package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageOutOrderInput {
    /**
     * 销售时间
     */
    private Long saleTime;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 出库订单状态，默认待提交，10：待提交、15 待审核 20：待出库、30：部分出库、40：已完成、50：已取消
     */
    private List<Integer> orderStatus;
    /**
     * 查询关键字（订单号/客户，模糊查询）
     */
    private String keyword;
    /**
     * 商品类型，
     */
    private Integer commodityTypeId;
}