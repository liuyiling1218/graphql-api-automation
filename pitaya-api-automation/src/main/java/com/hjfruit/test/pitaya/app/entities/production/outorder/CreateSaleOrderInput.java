package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 新增销售信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSaleOrderInput {
    /**
     * 仓库名称
     */
    @Needed
    private Integer warehouseId;
    /**
     * 客户Id
     */
    @Needed
    private Integer customerId;
    /**
     * 客户地址
     */
    @Needed
    private Integer customerDistributionId;
    /**
     * 销售时间
     */
    @Needed
    private Long saleTime;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 商品信息
     */
    @Needed
    private List<CreateSaleOrderItemInput> commodityList;
}