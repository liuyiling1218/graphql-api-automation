package com.hjfruit.test.pitaya.app.entities.cost;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreightCostPayload {
    /**
     * 费用id
     */
    private Integer costId;
    /**
     * 支付方式 10月结 20半月结 30次结
     */
    private Integer payMode;
    /**
     * 支付方式名称
     */
    private String payModeName;
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