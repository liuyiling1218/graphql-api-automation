package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 已入库商品信息
 */
@Data
public class InboundRecordPayload {
    /**
     * 已入库商品信息
     */
    private List<InboundRecordItemPayload> inboundRecordItems;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 入库单号
     */
    private String inOrderCode;
    /**
     * 入库人员
     */
    private String createUserName;
    /**
     * 入库时间
     */
    private Long inboundTime;
    /**
     * 入库备注
     */
    private String remark;
    /**
     * 预估运费
     */
    private BigDecimal deliveryFee;
}