package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 确认入库
 */
@Data
public class ConfirmInput {
    /**
     * 入库订单Id
     */
    @Needed
    private String inOrderId;
    /**
     * 本次入库操作备注信息
     */
    private String remark;
    /**
     * 入库商品信息
     */
    @Needed
    private List<ConfirmItemInput> items;
    /**
     *
     */
    private Integer belongType;
    /**
     *
     */
    private Integer belongId;
    /**
     * 预估运费
     */
    private BigDecimal deliveryFee;
}