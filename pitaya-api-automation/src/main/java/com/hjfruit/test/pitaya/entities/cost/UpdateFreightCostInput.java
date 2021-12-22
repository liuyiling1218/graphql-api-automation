package com.hjfruit.test.pitaya.entities.cost;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class UpdateFreightCostInput {
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 费用类型id
     */
    private Integer typeId;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 备注
     */
    private String note;
}