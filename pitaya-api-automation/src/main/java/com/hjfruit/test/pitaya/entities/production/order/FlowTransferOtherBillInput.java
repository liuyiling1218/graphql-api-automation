package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class FlowTransferOtherBillInput {
    /**
     * 费用类型
     */
    private Integer billType;
    /**
     * 付款方式
     */
    private Integer payMode;
    /**
     * 供应商id
     */
    private Integer supplierId;
    /**
     * 费用金额
     */
    private BigDecimal amount;
    /**
     * 车牌
     */
    private String brand;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
}