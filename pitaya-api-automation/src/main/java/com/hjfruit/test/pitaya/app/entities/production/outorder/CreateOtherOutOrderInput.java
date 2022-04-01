package com.hjfruit.test.pitaya.app.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 新增其他出库单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOtherOutOrderInput {
    /**
     * 商品类型
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 仓库id
     */
    @Needed
    private Integer warehouseId;
    /**
     * 客户Id
     */
    private Integer customerId;
    /**
     *
     */
    @Needed
    private Integer customerType;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 商品信息
     */
    @Needed
    private List<CreateOtherOutOrderItemInput> commodityList;
}