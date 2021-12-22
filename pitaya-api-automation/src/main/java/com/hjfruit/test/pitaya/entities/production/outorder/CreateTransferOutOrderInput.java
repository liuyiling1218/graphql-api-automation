package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 新增调拨出库单
 */
@Data
public class CreateTransferOutOrderInput {
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
     * 调入组织
     */
    @Needed
    private Integer transferOrgId;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 商品信息
     */
    @Needed
    private List<CreateTransferOutOrderItemInput> commodityList;
    /**
     * 调拨运杂费
     */
    private BigDecimal transferFee;
}