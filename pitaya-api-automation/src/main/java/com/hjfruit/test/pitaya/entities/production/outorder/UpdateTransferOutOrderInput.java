package com.hjfruit.test.pitaya.entities.production.outorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
/**
 * 
 */
@Data
public class UpdateTransferOutOrderInput{
    /**
     * 出库订单Id
     */
    @Needed 
    private String outOrderId;
    /**
     * 仓库名称
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
    /**
     * 商品类型
     */
    @Needed 
    private Integer commodityTypeId;
}