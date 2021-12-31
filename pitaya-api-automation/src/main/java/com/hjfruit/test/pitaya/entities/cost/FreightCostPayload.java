package com.hjfruit.test.pitaya.entities.cost;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class FreightCostPayload {
    /**
     * 费用id
     */
    private Integer costId;
    /**
     * 申请id
     */
    private String applyId;
    /**
     * 支付方式 10月结 20半月结 30次结
     */
    private Integer payMode;
    /**
     * 支付方式名称
     */
    private String payModeName;
    /**
     * 费用类型id
     */
    private Integer typeId;
    /**
     * 费用类型名称
     */
    private String costName;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 供应商ID
     */
    private Integer supplierId;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 备注
     */
    private String note;
}